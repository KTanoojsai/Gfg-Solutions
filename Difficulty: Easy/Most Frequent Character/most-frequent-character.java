import java.util.*;

class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char ans = 'a';
        int max = 0;

        for (char c : s.toCharArray()) {
            int freq = map.get(c);

            if (freq > max || (freq == max && c < ans)) {
                max = freq;
                ans = c;
            }
        }

        return ans;
    }
}