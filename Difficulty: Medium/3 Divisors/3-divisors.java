import java.util.*;

class Solution {
    public List<Integer> threeDivisors(List<Integer> query) {
        int maxVal = 0;
        for (int q : query) {
            if (q > maxVal) {
                maxVal = q;
            }
        }

        int limit = (int) Math.sqrt(maxVal);

        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        if (limit >= 0) isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int[] primePrefix = new int[limit + 1];
        for (int i = 1; i <= limit; i++) {
            primePrefix[i] = primePrefix[i - 1] + (isPrime[i] ? 1 : 0);
        }

        List<Integer> result = new ArrayList<>();
        for (int q : query) {
            int root = (int) Math.sqrt(q);
            result.add(primePrefix[root]);
        }

        return result;
    }
}