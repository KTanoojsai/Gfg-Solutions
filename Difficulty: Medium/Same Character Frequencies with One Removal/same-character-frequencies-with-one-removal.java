class Solution {
    public boolean sameFreq(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        if (allSame(freq)) {
            return true;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                if (allSame(freq)) {
                    return true;
                }
                freq[i]++;
            }
        }

        return false;
    }

    private boolean allSame(int[] freq) {
        int common = 0;
        for (int count : freq) {
            if (count > 0) {
                if (common == 0) {
                    common = count;
                } else if (count != common) {
                    return false;
                }
            }
        }
        return true;
    }
}