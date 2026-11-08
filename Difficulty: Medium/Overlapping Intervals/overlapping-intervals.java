import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (res.isEmpty() || res.get(res.size() - 1).get(1) < start) {
                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(start);
                interval.add(end);
                res.add(interval);
            } else {
                int lastEnd = res.get(res.size() - 1).get(1);
                res.get(res.size() - 1).set(1, Math.max(lastEnd, end));
            }
        }

        return res;
    }
}