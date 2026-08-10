class Solution {
    public boolean isKeith(int n) {
        // Code here

        int temp = n, k = 0;
        while (temp > 0) {
            k++;
            temp /= 10;
        }

        int[] digits = new int[k];
        temp = n;

        for (int i = k - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        while (true) {
            int sum = 0;
            for (int i = 0; i < k; i++)
                sum += digits[i];

            if (sum == n)
                return true;
            if (sum > n)
                return false;

            for (int i = 0; i < k - 1; i++)
                digits[i] = digits[i + 1];
            digits[k - 1] = sum;
        }
    }
}