class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        int n = arr.length;
        long maxSum = -1;
        int maxStart = -1;
        int maxEnd = -1;

        long currSum = 0;
        int currStart = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (currStart == -1) {
                    currStart = i;
                    currSum = 0;
                }
                currSum += arr[i];

                int currLen = i - currStart + 1;
                int maxLen = (maxStart == -1) ? 0 : (maxEnd - maxStart + 1);

                if (currSum > maxSum) {
                    maxSum = currSum;
                    maxStart = currStart;
                    maxEnd = i;
                } else if (currSum == maxSum) {
                    if (currLen > maxLen) {
                        maxStart = currStart;
                        maxEnd = i;
                    }
                }
            } else {
                currStart = -1;
                currSum = 0;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (maxStart == -1) {
            result.add(-1);
            return result;
        }

        for (int i = maxStart; i <= maxEnd; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}