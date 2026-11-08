class Solution {
    int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long low = 1;
        long high = n;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == n) {
                return (int) mid;
            } else if (mid * mid < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) ans;
    }
}