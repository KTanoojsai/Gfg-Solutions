class Solution {
    public int getNthPell(int n) {
        // Code here
         long mod = 1000000007;

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long c = (2 * b + a) % mod;
            a = b;
            b = c;
        }

        return (int)b;
        
    }
}