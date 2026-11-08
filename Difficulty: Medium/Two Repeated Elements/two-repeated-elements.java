class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] res = new int[2];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val] < 0) {
                res[idx++] = val;
                if (idx == 2) {
                    break;
                }
            } else {
                arr[val] = -arr[val];
            }
        }

        return res;
    }
}