import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findDiff(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        if (freqMap.size() <= 1) {
            return 0;
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (int count : freqMap.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
            if (count < minFreq) {
                minFreq = count;
            }
        }

        return maxFreq - minFreq;
    }
}