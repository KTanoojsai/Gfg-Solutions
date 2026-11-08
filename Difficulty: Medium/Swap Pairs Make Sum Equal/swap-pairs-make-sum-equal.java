class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        long sumA = 0;
        for (int x : a) {
            sumA += x;
        }

        long sumB = 0;
        for (int y : b) {
            sumB += y;
        }

        long diff = sumA - sumB;

        if (diff % 2 != 0) {
            return false;
        }

        long targetDiff = diff / 2;

        boolean[] presentInB = new boolean[1001];
        for (int y : b) {
            presentInB[y] = true;
        }

        for (int x : a) {
            long targetY = x - targetDiff;
            if (targetY >= 1 && targetY <= 1000 && presentInB[(int) targetY]) {
                return true;
            }
        }

        return false;
    }
}