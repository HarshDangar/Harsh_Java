public class P2331 {
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

    private static boolean evaluateTree(TreeNode root) {
        if (root.val == 0 || root.val == 1)
            return root.val == 1;

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        return root.val == 2 ? left | right : left & right;
    }
}
