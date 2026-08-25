public class P404 {
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

    private static int sumOfLeftLeaves(TreeNode root) {
        return solve(root, false);
    }

    private static int solve(TreeNode root, boolean isLeft) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null && isLeft) {
            return root.val;
        }

        return solve(root.left, true) + solve(root.right, false);
    }
}
