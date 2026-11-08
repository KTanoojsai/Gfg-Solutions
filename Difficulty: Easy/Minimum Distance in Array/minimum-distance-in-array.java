class Solution {
    int minDist(int arr[], int x, int y) {
        int lastPos = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (lastPos != -1 && arr[i] != arr[lastPos]) {
                    minDistance = Math.min(minDistance, i - lastPos);
                }
                lastPos = i;
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}