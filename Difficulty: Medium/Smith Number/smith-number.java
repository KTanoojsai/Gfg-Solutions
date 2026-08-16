class Solution {
    public boolean smithNum(int n) {
        int original = n;
        int digitSum = 0;

        // Sum of digits of n
        while (n > 0) {
            digitSum += n % 10;
            n /= 10;
        }

        n = original;
        int factorSum = 0;
        boolean composite = false;

        // Prime factorization
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factorSum += digitSum(i);
                n /= i;
                composite = true;
            }
        }

        // Remaining prime factor
        if (n > 1) {
            factorSum += digitSum(n);
        }

        return composite && factorSum == digitSum;
    }

    private int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}