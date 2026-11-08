class Solution {
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfHead = reverseList(slow.next);
        slow.next = null;

        Node firstHalf = head;
        Node secondHalf = secondHalfHead;
        boolean result = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        slow.next = reverseList(secondHalfHead);

        return result;
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}