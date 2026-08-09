class Solution {
    public boolean isKaprekar(int n) {
        // code here
        int square = n * n;
        int temp = n;
        int divisor = 1;
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }
        int right = square % divisor;
        int left = square / divisor;
        if(left != 0 && right != 0 && left + right == n)
            return true;
        else
            return false;
    }
};