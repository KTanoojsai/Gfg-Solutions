class Solution {
    public Node findLCA(Node root, Node n1, Node n2) {
        Node curr = root;
        while (curr != null) {
            if (curr.data > n1.data && curr.data > n2.data) {
                curr = curr.left;
            } else if (curr.data < n1.data && curr.data < n2.data) {
                curr = curr.right;
            } else {
                return curr;
            }
        }
        return null;
    }
}