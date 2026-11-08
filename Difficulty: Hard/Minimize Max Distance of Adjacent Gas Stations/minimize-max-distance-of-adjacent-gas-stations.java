class Solution {
    public double minMaxDist(int[] stations, int k) {
        int n = stations.length;
        double low = 0;
        double high = 0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }

        double diff = 1e-6;
        while ((high - low) > diff) {
            double mid = low + (high - low) / 2.0;
            if (isPossible(stations, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

    private boolean isPossible(int[] stations, int k, double dist) {
        int count = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            count += (int) ((stations[i + 1] - stations[i]) / dist);
        }
        return count <= k;
    }
}