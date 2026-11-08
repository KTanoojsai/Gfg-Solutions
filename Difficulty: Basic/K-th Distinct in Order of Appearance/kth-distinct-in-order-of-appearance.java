import java.util.HashMap;
import java.util.Map;

class Solution {
    public int kthDistinct(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : arr) {
            if (freq.get(num) == 1) {
                count++;
                if (count == k) {
                    return num;
                }
            }
        }

        return -1;
    }
}