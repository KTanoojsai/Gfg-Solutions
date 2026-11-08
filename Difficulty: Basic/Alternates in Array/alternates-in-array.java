class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;
    }
}