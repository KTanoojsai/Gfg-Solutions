class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        if (n > 9) {
            return result;
        }

        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                result.add(i);
            }
            return result;
        }

        generate(n, 1, 0, result);
        return result;
    }

    private static void generate(int n, int startDigit, int currentNumber, ArrayList<Integer> result) {
        if (n == 0) {
            result.add(currentNumber);
            return;
        }

        for (int digit = startDigit; digit <= 9; digit++) {
            generate(n - 1, digit + 1, currentNumber * 10 + digit, result);
        }
    }
}