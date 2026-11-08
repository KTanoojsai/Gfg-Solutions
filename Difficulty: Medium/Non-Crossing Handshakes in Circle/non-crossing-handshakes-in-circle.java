class Solution {
    static int count(int n) {
        int pairs = n / 2;
        int[] dp = new int[pairs + 1];
        dp[0] = 1;

        for (int i = 1; i <= pairs; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return dp[pairs];
    }
}