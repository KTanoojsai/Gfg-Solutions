import java.util.Arrays;

class Solution {
    public String minSum(int[] arr) {
        Arrays.sort(arr);

        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = arr.length - 1;
        int j = arr.length - 2;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr[i];
                i -= 2;
            }
            if (j >= 0) {
                sum += arr[j];
                j -= 2;
            }
            res.append(sum % 10);
            carry = sum / 10;
        }

        while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        if (res.length() == 0) {
            return "0";
        }

        return res.reverse().toString();
    }
}