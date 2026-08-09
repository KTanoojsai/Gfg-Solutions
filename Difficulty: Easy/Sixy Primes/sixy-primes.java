class Solution {
    public ArrayList<Integer> sixyPrime(int l, int r) {
        // Code here
          ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r - 6; i++) {
            if (isPrime(i) && isPrime(i + 6)) {
                result.add(i);
                result.add(i + 6);
            }
        }

        return result;
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}