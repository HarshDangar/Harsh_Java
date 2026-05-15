public class P110 {
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

    private static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int left = heightCal(root.left);
        int right = heightCal(root.right);

        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int heightCal(TreeNode root) {
        if (root == null)
            return 0;

        int left = heightCal(root.left);
        int right = heightCal(root.right);

        return Math.max(left, right) + 1;
    }
}
