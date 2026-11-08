class Solution {
    int maxHeight(int[] arr, int m) {
        int low = 0;
        int high = 0;

        for (int height : arr) {
            if (height > high) {
                high = height;
            }
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canCut(arr, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canCut(int[] arr, int h, int m) {
        long totalWood = 0;

        for (int tree : arr) {
            if (tree > h) {
                totalWood += (tree - h);
                if (totalWood >= m) {
                    return true;
                }
            }
        }

        return totalWood >= m;
    }
}