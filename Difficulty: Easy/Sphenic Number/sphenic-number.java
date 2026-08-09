class Solution {
    public boolean isSphenicNo(int n) {
        // code here
        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int factorCount = 0;

                while (n % i == 0) {
                    n /= i;
                    factorCount++;
                }

                if (factorCount > 1)
                    return false;

                count++;
            }
        }

        if (n > 1)
            count++;

        return count == 3;
    }
}