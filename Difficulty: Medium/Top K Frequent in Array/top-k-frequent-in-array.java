import java.util.*;

class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(freqMap.keySet());

        list.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            }
            return Integer.compare(b, a);
        });

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && i < list.size(); i++) {
            result.add(list.get(i));
        }

        return result;
    }
}