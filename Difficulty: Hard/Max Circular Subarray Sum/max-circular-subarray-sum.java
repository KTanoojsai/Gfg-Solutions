class Solution {
    public int maxCircularSum(int arr[]) {
        if (arr == null || arr.length == 0) return 0;

        int totalSum = 0;
        int maxKadane = arr[0], currMax = 0;
        int minKadane = arr[0], currMin = 0;

        for (int x : arr) {
            totalSum += x;

            currMax = Math.max(x, currMax + x);
            maxKadane = Math.max(maxKadane, currMax);

            currMin = Math.min(x, currMin + x);
            minKadane = Math.min(minKadane, currMin);
        }

        if (maxKadane < 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, totalSum - minKadane);
    }
}