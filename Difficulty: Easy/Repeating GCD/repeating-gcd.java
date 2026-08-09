class Solution {
    public int findGcd(int n, int x, int y) {
        // code here
        int g = gcdValue(x, y);
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int power = 1;
        for (int i = 0; i < digits; i++)
            power *= 10;
        int multiplier = 0;
        int p = 1;
        for (int i = 0; i < g; i++) {
            multiplier += p;
            p *= power;
        }
        return n * multiplier;
    }
    static int gcdValue(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}