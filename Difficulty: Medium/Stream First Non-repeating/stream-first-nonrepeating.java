class Solution {
    public String firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            int freq = map.getOrDefault(c, 0) + 1;
            map.put(c, freq);

            if (freq == 1) {
                set.add(c);
            } else if (freq == 2) {
                set.remove(c);
            }

            if (set.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(set.iterator().next());
            }
        }

        return ans.toString();
    }
}