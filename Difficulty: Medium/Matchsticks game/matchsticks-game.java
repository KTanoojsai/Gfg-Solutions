class Solution {
    static int matchGame(Long N) {
        long rem = N % 5;

        if (rem == 0)
            return -1;

        return (int) rem;
    }
}