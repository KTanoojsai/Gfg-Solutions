class Solution {
    public static boolean isLucky(int n) {
        for (int counter = 2; counter <= n; counter++) {
            if (n % counter == 0) {
                return false;
            }
            n -= n / counter;
        }
        return true;
    }
}