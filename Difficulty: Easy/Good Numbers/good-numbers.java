import java.util.*;

class Solution {
    public ArrayList<Integer> goodNumbers(int l, int r, int d) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int n = l; n <= r; n++) {
            int temp = n;
            int sum = 0;
            boolean good = true;
            boolean first = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == d) {
                    good = false;
                    break;
                }

                if (!first && digit <= sum) {
                    good = false;
                    break;
                }

                sum += digit;
                temp /= 10;
                first = false;
            }

            if (good)
                a.add(n);
        }

        return a;
    }
}
