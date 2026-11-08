class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}