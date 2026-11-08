import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minSwaps(int arr[]) {
        int n = arr.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][1];
                cycleSize++;
            }

            if (cycleSize > 1) {
                ans += (cycleSize - 1);
            }
        }

        return ans;
    }
}