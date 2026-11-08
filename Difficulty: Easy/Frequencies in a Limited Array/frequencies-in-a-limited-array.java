class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];

        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num - 1]++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>(n);
        for (int count : freq) {
            result.add(count);
        }

        return result;
    }
}