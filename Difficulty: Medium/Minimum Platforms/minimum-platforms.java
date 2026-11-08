import java.util.Arrays;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int count = 0;
        int maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++;
                maxPlatforms = Math.max(maxPlatforms, count);
                i++;
            } else {
                count--;
                j++;
            }
        }

        return maxPlatforms;
    }
}