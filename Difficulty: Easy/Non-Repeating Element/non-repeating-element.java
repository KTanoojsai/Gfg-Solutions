import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}