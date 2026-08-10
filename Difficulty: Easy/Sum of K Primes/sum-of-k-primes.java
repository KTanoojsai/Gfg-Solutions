class Solution {
    public boolean isSumOfKprimes(int n, int k) {
        if (n < 2 * k)
            return false;

        if (k == 1)
            return isPrime(n);

        if (k == 2)
            return isPrime(n - 2) || (n % 2 == 0);

        if (k == 3) {
            if (n % 2 == 0)
                return isPrime(n - 4);
            return true;
        }

        return true;
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; (long)i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}