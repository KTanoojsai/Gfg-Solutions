class Solution {
    public int nthSmartNum(int n) {
        int MAX = 100000;

        int[] factors = new int[MAX + 1];

        // Count distinct prime factors using sieve
        for (int i = 2; i <= MAX; i++) {
            if (factors[i] == 0) {
                for (int j = i; j <= MAX; j += i) {
                    factors[j]++;
                }
            }
        }

        int count = 0;

        for (int i = 2; i <= MAX; i++) {
            if (factors[i] >= 3) {
                count++;

                if (count == n) {
                    return i;
                }
            }
        }

        return -1;
    }
}