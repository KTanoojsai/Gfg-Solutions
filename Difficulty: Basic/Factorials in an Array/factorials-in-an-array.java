class Solution {
    public List<Integer> factorialNumbers(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        for (int x : arr) {
            int n = x;
            int i = 2;

            while (n > 1 && n % i == 0) {
                n = n / i;
                i++;
            }

            if (n == 1) {
                result.add(x);
            }
        }

        return result;
    }
}