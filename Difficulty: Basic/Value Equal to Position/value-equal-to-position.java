class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}