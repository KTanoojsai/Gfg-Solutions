class Solution {
    public int firstRepeated(int[] arr) {
        java.util.HashMap<Integer, Integer> countMap = new java.util.HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (countMap.get(arr[i]) > 1) {
                return i + 1;
            }
        }

        return -1;
    }
}