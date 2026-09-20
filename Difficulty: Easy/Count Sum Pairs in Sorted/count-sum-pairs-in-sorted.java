class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int count = 0;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                if (arr[l] == arr[r]) {
                    int k = r - l + 1;
                    count += (k * (k - 1)) / 2;
                    break;
                }
                int cnt1 = 1, cnt2 = 1;
                while (l + 1 < r && arr[l] == arr[l + 1]) {
                    cnt1++;
                    l++;
                }
                while (r - 1 > l && arr[r] == arr[r - 1]) {
                    cnt2++;
                    r--;
                }
                count += cnt1 * cnt2;
                l++;
                r--;
            }
        }

        return count;
    }
}