class Solution {
    boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }

        Node curr = head.next;

        while (curr != null && curr != head) {
            curr = curr.next;
        }

        return curr == head;
    }
}