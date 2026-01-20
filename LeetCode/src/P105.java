import java.util.HashMap;

public class P105 {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
        System.out.println(buildTree(preorder, inorder));
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        int[] index = {0};

        return helper(preorder, inorder, 0, preorder.length - 1, map, index);
    }

    private static TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if (left > right) {
            return null;
        }

        int current = preOrder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node;
        }

        int inorderIndex = map.get(current);

        node.left = helper(preOrder, inOrder, left, inorderIndex - 1, map, index);
        node.right = helper(preOrder, inOrder, inorderIndex + 1, right, map, index);

        return node;
    }
}
