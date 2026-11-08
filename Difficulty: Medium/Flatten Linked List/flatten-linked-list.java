import java.util.PriorityQueue;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        Node curr = head;
        while (curr != null) {
            pq.add(curr);
            curr = curr.next;
        }

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node minNode = pq.poll();
            tail.bottom = minNode;
            tail = minNode;

            if (minNode.bottom != null) {
                pq.add(minNode.bottom);
            }
        }

        return dummy.bottom;
    }
}