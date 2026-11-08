class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> row = new ArrayList<>();
        long val = 1;
        row.add((int) val);

        for (int k = 1; k < n; k++) {
            val = val * (n - k) / k;
            row.add((int) val);
        }

        return row;
    }
}