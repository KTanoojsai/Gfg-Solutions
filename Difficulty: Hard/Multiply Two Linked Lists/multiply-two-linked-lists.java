class Solution {
    int multiplyTwoLists(Node first, Node second) {
        long MOD = 1000000007L;
        long num1 = 0;
        long num2 = 0;

        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        return (int) ((num1 * num2) % MOD);
    }
}