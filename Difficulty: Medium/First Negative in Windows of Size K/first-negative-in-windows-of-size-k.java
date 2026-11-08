import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                dq.addLast(i);
            }
        }

        if (!dq.isEmpty()) {
            result.add(arr[dq.peekFirst()]);
        } else {
            result.add(0);
        }

        for (int i = k; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            if (arr[i] < 0) {
                dq.addLast(i);
            }

            if (!dq.isEmpty()) {
                result.add(arr[dq.peekFirst()]);
            } else {
                result.add(0);
            }
        }

        return result;
    }
}