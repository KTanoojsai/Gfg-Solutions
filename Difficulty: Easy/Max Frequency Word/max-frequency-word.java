class Solution {
    public String maximumFrequency(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String ans = "";
        int max = 0;
        for (String word : words) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans + " " + max;
    }
}