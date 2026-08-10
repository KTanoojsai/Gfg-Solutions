class Solution {
    public int nearestPower(int n, int m) {
        // code here
          if (m == 1)
            return 1;

        long lower = 1;

        while (lower * m <= n)
            lower *= m;

        long upper = lower * m;

        if (n - lower < upper - n)
            return (int) lower;
        else
            return (int) upper;
    }
}