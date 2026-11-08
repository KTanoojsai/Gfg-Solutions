import java.util.HashSet;

class Solution {
    public int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}