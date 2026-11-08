import java.util.HashMap;

class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}