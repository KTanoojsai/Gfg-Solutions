import java.util.Arrays;

class Solution {
    public int maxPerimeter(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return -1;
        }

        Arrays.sort(arr);

        for (int i = n - 1; i >= 2; i--) {
            if (arr[i - 1] + arr[i - 2] > arr[i]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }

        return -1;
    }
}