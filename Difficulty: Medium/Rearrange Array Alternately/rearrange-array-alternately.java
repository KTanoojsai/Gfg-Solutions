import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        int n = arr.length;
        if (n <= 1) return;

        Arrays.sort(arr);

        int minIdx = 0;
        int maxIdx = n - 1;
        long maxElem = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(arr[i] / maxElem);
        }
    }
}