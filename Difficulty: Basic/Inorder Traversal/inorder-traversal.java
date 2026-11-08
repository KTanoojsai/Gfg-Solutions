class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        traverse(node.left, result);
        result.add(node.data);
        traverse(node.right, result);
    }
}