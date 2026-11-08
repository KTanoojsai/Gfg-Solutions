class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 1;
                Node temp = slow.next;
                while (temp != slow) {
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }

        return 0;
    }
}