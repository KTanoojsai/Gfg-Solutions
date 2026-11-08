class Solution {
    private void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public ArrayList<Integer> merge(Node r1, Node r2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(r1, list1);
        inorder(r2, list2);

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = list1.size(), n2 = list2.size();

        while (i < n1 && j < n2) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        while (i < n1) {
            result.add(list1.get(i++));
        }

        while (j < n2) {
            result.add(list2.get(j++));
        }

        return result;
    }
}