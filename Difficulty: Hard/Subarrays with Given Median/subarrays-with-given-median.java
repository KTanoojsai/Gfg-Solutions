class Solution {
    private static final int MOD = 1000000007;

    private static class FenwickTree {
        private final int[] tree;
        private final int size;

        public FenwickTree(int n) {
            this.size = n;
            this.tree = new int[n + 1];
        }

        public void update(int index, int delta) {
            for (; index <= size; index += index & -index) {
                tree[index] += delta;
            }
        }

        public int query(int index) {
            int sum = 0;
            for (; index > 0; index -= index & -index) {
                sum += tree[index];
            }
            return sum;
        }
    }

    private long countGreaterOrEqual(int[] arr, int x) {
        int n = arr.length;
        int offset = n + 1;
        FenwickTree bit = new FenwickTree(2 * n + 2);

        long count = 0;
        int prefixSum = 0;
        bit.update(prefixSum + offset, 1);

        for (int num : arr) {
            prefixSum += (num >= x) ? 1 : -1;
            count += bit.query(prefixSum + offset - 1);
            bit.update(prefixSum + offset, 1);
        }

        return count;
    }

    public int countSubarray(int[] arr, int m) {
        long countM = countGreaterOrEqual(arr, m);
        long countMPlus1 = countGreaterOrEqual(arr, m + 1);
        long ans = (countM - countMPlus1) % MOD;
        if (ans < 0) {
            ans += MOD;
        }
        return (int) ans;
    }
}