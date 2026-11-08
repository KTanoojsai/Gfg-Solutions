class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> result = new ArrayList<>();
        PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

        for (int num : arr) {
            if (leftMaxHeap.isEmpty() || num <= leftMaxHeap.peek()) {
                leftMaxHeap.add(num);
            } else {
                rightMinHeap.add(num);
            }

            if (leftMaxHeap.size() > rightMinHeap.size() + 1) {
                rightMinHeap.add(leftMaxHeap.poll());
            } else if (rightMinHeap.size() > leftMaxHeap.size()) {
                leftMaxHeap.add(rightMinHeap.poll());
            }

            if (leftMaxHeap.size() == rightMinHeap.size()) {
                result.add((leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0);
            } else {
                result.add((double) leftMaxHeap.peek());
            }
        }

        return result;
    }
}