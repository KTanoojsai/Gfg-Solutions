class Solution {
    public int findPages(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1;
        }

        long low = 0;
        long high = 0;

        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) result;
    }

    private boolean isPossible(int[] arr, int k, long maxPages) {
        int studentsRequired = 1;
        long currentPages = 0;

        for (int pages : arr) {
            if (currentPages + pages > maxPages) {
                studentsRequired++;
                currentPages = pages;

                if (studentsRequired > k) {
                    return false;
                }
            } else {
                currentPages += pages;
            }
        }

        return true;
    }
}