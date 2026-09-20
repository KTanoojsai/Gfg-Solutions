class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        int r = i;
        int l = (i + 1) % n;
        while (l != r) {
            int currentSum = arr[l] + arr[r];
            if (currentSum == target) {
                return true;
            }
            if (currentSum < target) {
                l = (l + 1) % n; 
            } else {
                r = (n + r - 1) % n;
            }
        }

        return false;
    }
}