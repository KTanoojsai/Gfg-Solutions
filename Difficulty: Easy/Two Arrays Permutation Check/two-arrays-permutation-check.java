import java.util.HashMap;

class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!map.containsKey(num)) {
                return false;
            }
            int count = map.get(num);
            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
        }

        return map.isEmpty();
    }
}