class Solution {
    ArrayList<Integer> findXY(int a, int b) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();

        int g = gcd(a, b);

        ans.add(b / g);
        ans.add(a / g);

        return ans;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}