class Solution {
    public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] < arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}