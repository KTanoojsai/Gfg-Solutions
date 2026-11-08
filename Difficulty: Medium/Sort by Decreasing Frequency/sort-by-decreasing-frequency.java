class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            }
            return Integer.compare(a, b);
        });

        return list;
    }
}