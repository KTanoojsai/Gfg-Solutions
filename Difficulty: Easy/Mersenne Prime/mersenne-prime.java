class Solution {
    public List<Integer> allMersennePrimeNo(int n) {
        List<Integer> ans = new ArrayList<>();

        for (int k = 2; ; k++) {
            int num = (1 << k) - 1;

            if (num > n)
                break;

            if (isPrime(num))
                ans.add(num);
        }

        return ans;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;

        if (n % 2 == 0)
            return n == 2;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}