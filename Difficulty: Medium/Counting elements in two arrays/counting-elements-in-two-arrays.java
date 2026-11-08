import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>(a.length);

        for (int val : a) {
            result.add(countLessOrEqual(b, val));
        }

        return result;
    }

    private static int countLessOrEqual(int[] b, int target) {
        int low = 0;
        int high = b.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (b[mid] <= target) {
                count = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return count;
    }
}