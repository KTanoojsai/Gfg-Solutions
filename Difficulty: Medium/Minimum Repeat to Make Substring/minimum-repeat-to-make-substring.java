class Solution {
    public int minRepeats(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < s2.length()) {
            sb.append(s1);
            count++;
        }

        if (kmpSearch(sb.toString(), s2)) {
            return count;
        }

        sb.append(s1);
        count++;

        if (kmpSearch(sb.toString(), s2)) {
            return count;
        }

        return -1;
    }

    private boolean kmpSearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                return true;
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}