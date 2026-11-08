import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        if (k <= 1) {
            return arr.length > 0 ? arr[0] : -1;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            int count = countMap.getOrDefault(num, 0) + 1;
            if (count == k) {
                return num;
            }
            countMap.put(num, count);
        }

        return -1;
    }
}