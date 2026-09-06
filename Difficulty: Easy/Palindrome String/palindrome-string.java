class Solution {
    boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (left < right) {
            if (c[left] != c[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}