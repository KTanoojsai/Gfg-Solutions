class Solution {
    public List<Integer> noSibling(Node root) {
        List<Integer> result = new ArrayList<>();
        findNoSibling(root, result);

        if (result.isEmpty()) {
            result.add(-1);
            return result;
        }

        Collections.sort(result);
        return result;
    }

    private void findNoSibling(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (node.left != null && node.right == null) {
            result.add(node.left.data);
        } else if (node.left == null && node.right != null) {
            result.add(node.right.data);
        }

        findNoSibling(node.left, result);
        findNoSibling(node.right, result);
    }
}