class Solution {
    public boolean isWoodall(int n) {
        // code here
        for (int k = 1; ; k++) {
            long value = (long) k * (1L << k) - 1;

            if (value == n)
                return true;

            if (value > n)
                return false;
            }
    }
}