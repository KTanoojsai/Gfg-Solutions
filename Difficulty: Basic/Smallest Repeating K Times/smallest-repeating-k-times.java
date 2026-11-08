class Solution {
    public int findDuplicate(int[] arr, int k) {
        int maxVal = 0;
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        int[] count = new int[maxVal + 1];
        for (int num : arr) {
            count[num]++;
        }

        for (int i = 0; i <= maxVal; i++) {
            if (count[i] == k) {
                return i;
            }
        }

        return -1;
    }
}