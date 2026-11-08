class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;

        while (i <= high) {
            if (arr[i] < a) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
                i++;
            } else if (arr[i] > b) {
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                i++;
            }
        }
    }
}