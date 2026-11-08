class Solution {
    public int nextHappy(int n) {
        int candidate = n + 1;
        while (!isHappy(candidate)) {
            candidate++;
        }
        return candidate;
    }

    private boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}