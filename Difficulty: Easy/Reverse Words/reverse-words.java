class Solution {
    public String reverseWords(String s) {

        s = s.replaceAll("^\\.+|\\.+$", "");

        if (s.isEmpty()) {
            return "";
        }

        String[] a = s.split("\\.+");

        int l = 0, r = a.length - 1;

        while (l < r) {
            String temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }

        return String.join(".", a);
    }
}