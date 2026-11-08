class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        if (head == null) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(forward);
            res.add(backward);
            return res;
        }

        Node curr = head;
        Node tail = null;

        while (curr != null) {
            forward.add(curr.data);
            if (curr.next == null) {
                tail = curr;
            }
            curr = curr.next;
        }

        curr = tail;
        while (curr != null) {
            backward.add(curr.data);
            curr = curr.prev;
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(forward);
        result.add(backward);
        return result;
    }
}