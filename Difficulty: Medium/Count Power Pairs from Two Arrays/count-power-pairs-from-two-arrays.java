import java.util.Arrays;

class Solution {
    private int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private long count(int x, int[] b, int n, int[] countB) {
        if (x == 0) return 0;
        if (x == 1) return countB[0];

        int idx = upperBound(b, x);
        long total = n - idx;

        total += countB[0] + countB[1];

        if (x == 2) {
            total -= (countB[3] + countB[4]);
        }
        if (x == 3) {
            total += countB[2];
        }

        return total;
    }

    public long countPairs(int[] a, int[] b) {
        int[] countB = new int[5];
        for (int y : b) {
            if (y < 5) {
                countB[y]++;
            }
        }

        Arrays.sort(b);

        long totalPairs = 0;
        for (int x : a) {
            totalPairs += count(x, b, b.length, countB);
        }

        return totalPairs;
    }
}