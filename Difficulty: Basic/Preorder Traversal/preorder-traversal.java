class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.data);
        traverse(node.left, result);
        traverse(node.right, result);
    }
}