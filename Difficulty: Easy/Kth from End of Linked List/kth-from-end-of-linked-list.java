class Solution {
    public int getKthFromLast(Node head, int k) {
        if (head == null || k <= 0) return -1;

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }
}