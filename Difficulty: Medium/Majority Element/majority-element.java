import java.util.*;

class Solution {
    int majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}