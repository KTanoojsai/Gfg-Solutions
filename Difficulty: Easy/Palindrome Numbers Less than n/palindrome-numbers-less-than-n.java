class Solution {
    public int countPalindromes(int n) {
        if (n <= 1)
            return 0;

        String s = String.valueOf(n);
        int len = s.length();
        int count = 0;

        // Palindromes having fewer digits
        for (int d = 1; d < len; d++) {
            count += 9 * (int)Math.pow(10, (d - 1) / 2);
        }

        // First half of n
        int halfLen = (len + 1) / 2;
        int firstHalf = Integer.parseInt(s.substring(0, halfLen));

        int smallestHalf = (int)Math.pow(10, (len - 1) / 2);

        count += firstHalf - smallestHalf;

        // Form palindrome from first half
        String left = s.substring(0, halfLen);
        String right = left.substring(0, len / 2);

        String pal = left + new StringBuilder(right).reverse();

        // We need palindromes STRICTLY less than n
        if (Long.parseLong(pal) < n)
            count++;

        return count;
    }
}