class Solution {
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node trimLeadingZeros(Node head) {
        while (head != null && head.data == 0 && head.next != null) {
            head = head.next;
        }
        return head;
    }

    public Node addTwoLists(Node head1, Node head2) {
        head1 = trimLeadingZeros(head1);
        head2 = trimLeadingZeros(head2);

        head1 = reverse(head1);
        head2 = reverse(head2);

        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        Node result = reverse(dummy.next);
        return trimLeadingZeros(result);
    }
}