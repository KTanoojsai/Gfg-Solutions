class Solution {
    public Node delNode(Node root, int x) {
        if (root == null) {
            return null;
        }

        if (x < root.data) {
            root.left = delNode(root.left, x);
        } else if (x > root.data) {
            root.right = delNode(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node successor = getSuccessor(root.right);
            root.data = successor.data;
            root.right = delNode(root.right, successor.data);
        }

        return root;
    }

    private Node getSuccessor(Node curr) {
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}