class Solution {
    public ArrayList<ArrayList<Integer>> freqSorted(int[] arr) {
        java.util.Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int n = arr.length;
        int i = 0;
        while (i < n) {
            int val = arr[i];
            int count = 0;
            while (i < n && arr[i] == val) {
                count++;
                i++;
            }
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(val);
            pair.add(count);
            result.add(pair);
        }

        return result;
    }
}