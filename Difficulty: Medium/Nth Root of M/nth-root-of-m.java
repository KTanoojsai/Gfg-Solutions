class Solution {
    private int powerCheck(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }

    public int nthRoot(int n, int m) {
        if (m == 0) return 0;
        if (m == 1) return 1;

        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midPower = powerCheck(mid, n, m);

            if (midPower == 1) {
                return mid;
            } else if (midPower == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}