class Solution {
    public ArrayList<Integer> seeds(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x = 1; x < n; x++) {
            int temp = x;
            int product = x;

            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }

            if (product == n)
                ans.add(x);
        }

        if (ans.size() == 0)
            ans.add(-1);

        return ans;
    }
}