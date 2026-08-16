class Solution {
    public int[] emirpNumbers(int n) {
        boolean[] prime = new boolean[n + 1];

        if (n >= 2) {
            java.util.Arrays.fill(prime, true);
            prime[0] = false;
            prime[1] = false;

            for (int i = 2; i * i <= n; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }
        }

        int count = 0;

        // First count the answer size
        for (int i = 13; i <= n; i++) {
            if (prime[i]) {
                int rev = reverse(i);

                if (rev != i && rev <= n && prime[rev]) {
                    count++;
                }
            }
        }

        int[] ans = new int[count];
        int index = 0;

        // Store the Emirp numbers
        for (int i = 13; i <= n; i++) {
            if (prime[i]) {
                int rev = reverse(i);

                if (rev != i && rev <= n && prime[rev]) {
                    ans[index++] = i;
                }
            }
        }

        return ans;
    }

    private int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }
}