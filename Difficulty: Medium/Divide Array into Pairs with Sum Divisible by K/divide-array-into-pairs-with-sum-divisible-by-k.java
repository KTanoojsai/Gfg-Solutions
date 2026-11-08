class Solution {
    public boolean canPairs(int[] arr, int k) {
        if (arr.length % 2 != 0) {
            return false;
        }

        int[] remainderCount = new int[k];
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            remainderCount[rem]++;
        }

        if (remainderCount[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                if (remainderCount[i] % 2 != 0) {
                    return false;
                }
            } else {
                if (remainderCount[i] != remainderCount[k - i]) {
                    return false;
                }
            }
        }

        return true;
    }
}