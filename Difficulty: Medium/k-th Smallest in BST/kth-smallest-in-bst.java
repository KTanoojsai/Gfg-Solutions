class Solution {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(Node root, int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result;
    }

    private void inorder(Node root, int k) {
        if (root == null || result != -1) {
            return;
        }

        inorder(root.left, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        inorder(root.right, k);
    }
}