class Solution {
    public int reverseExponentiation(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        long base = n;
        long exp = rev;
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }

        return (int) result;
    }
}