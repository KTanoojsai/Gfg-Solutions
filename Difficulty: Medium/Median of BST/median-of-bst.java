class Solution {
    public int findMedian(Node root) {
        int n = countNodes(root);
        int target = (n % 2 == 0) ? (n / 2) : ((n + 1) / 2);

        int[] count = new int[]{0};
        int[] result = new int[]{-1};

        inorder(root, count, target, result);
        return result[0];
    }

    private int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private void inorder(Node root, int[] count, int target, int[] result) {
        if (root == null || result[0] != -1) return;

        inorder(root.left, count, target, result);

        count[0]++;
        if (count[0] == target) {
            result[0] = root.data;
            return;
        }

        inorder(root.right, count, target, result);
    }
}