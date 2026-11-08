class Solution {
    public int splitArray(int[] arr, int k) {
        int low = 0;
        int high = 0;

        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] arr, int k, int maxAllowedSum) {
        int count = 1;
        int currentSum = 0;

        for (int num : arr) {
            if (currentSum + num <= maxAllowedSum) {
                currentSum += num;
            } else {
                count++;
                currentSum = num;
            }
        }

        return count <= k;
    }
}