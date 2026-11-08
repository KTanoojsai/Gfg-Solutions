class Solution {
    public int powMod(int x, int n, int M) {
        long res = 1;
        long base = x % M;
        long exp = n;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % M;
            }
            base = (base * base) % M;
            exp >>= 1;
        }

        return (int) (res % M);
    }
}