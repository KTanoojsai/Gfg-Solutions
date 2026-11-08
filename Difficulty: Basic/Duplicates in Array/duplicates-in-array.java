class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        }

        return res;
    }
}