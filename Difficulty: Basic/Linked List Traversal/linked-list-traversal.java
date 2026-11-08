class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            result.add(curr.data);
            curr = curr.next;
        }
        return result;
    }
}