class Solution {
    public ArrayList<Integer> primeTwins(int l, int r) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = l; i <= r - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                ans.add(i);
                ans.add(i + 2);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}