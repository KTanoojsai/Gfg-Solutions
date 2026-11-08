class solution {
    ArrayList<Integer> uniqueNumbers(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (hasDistinctDigits(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean hasDistinctDigits(int n) {
        int mask = 0;

        while (n > 0) {
            int digit = n % 10;
            if ((mask & (1 << digit)) != 0) {
                return false;
            }
            mask |= (1 << digit);
            n /= 10;
        }

        return true;
    }
}