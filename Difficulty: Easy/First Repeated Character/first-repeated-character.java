class Solution {
    String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return String.valueOf(c);
            }
            set.add(c);
        }

        return "-1";
    }
}
