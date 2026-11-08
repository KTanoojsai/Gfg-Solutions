import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static long jumpingNums(long n) {
        long ans = 0;
        Queue<Long> q = new LinkedList<>();

        for (long i = 1; i <= 9 && i <= n; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            long num = q.poll();

            if (num <= n) {
                ans = Math.max(ans, num);

                int lastDigit = (int) (num % 10);

                if (lastDigit > 0) {
                    long nextNum1 = num * 10 + (lastDigit - 1);
                    if (nextNum1 <= n) {
                        q.add(nextNum1);
                    }
                }

                if (lastDigit < 9) {
                    long nextNum2 = num * 10 + (lastDigit + 1);
                    if (nextNum2 <= n) {
                        q.add(nextNum2);
                    }
                }
            }
        }

        return ans;
    }
}