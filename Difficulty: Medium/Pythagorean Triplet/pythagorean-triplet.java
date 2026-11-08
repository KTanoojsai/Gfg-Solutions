class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int maxVal = 0;
        for (int x : arr) {
            if (x > maxVal) {
                maxVal = x;
            }
        }

        int[] count = new int[maxVal + 1];
        for (int x : arr) {
            count[x]++;
        }

        for (int a = 1; a <= maxVal; a++) {
            if (count[a] == 0) continue;

            for (int b = 1; b <= maxVal; b++) {
                if (count[b] == 0) continue;
                if (a == b && count[a] < 2) continue;

                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c <= maxVal && count[c] > 0) {
                    return true;
                }
            }
        }

        return false;
    }
}