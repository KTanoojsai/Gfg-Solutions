class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    if (arr[l] == arr[r]) {
                        int total = r - l + 1;
                        count += (total * (total - 1)) / 2;
                        break;
                    } else {
                        int leftVal = arr[l];
                        int countLeft = 0;
                        while (l <= r && arr[l] == leftVal) {
                            countLeft++;
                            l++;
                        }
                        int rightVal = arr[r];
                        int countRight = 0;
                        while (l <= r && arr[r] == rightVal) {
                            countRight++;
                            r--;
                        }
                        count += countLeft * countRight;
                    }
                }
            }
        }
        return count;
    }
}