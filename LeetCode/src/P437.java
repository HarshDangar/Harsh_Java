public class P437 {
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

    //Approach - 1: We are checking every possible node : O(n^2)
    static int total = 0;
    private static int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        findPathSum(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return total;
    }

    private static void findPathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null)
            return;

        currentSum += root.val;

        if (targetSum == currentSum) {
            total++;
        }

        findPathSum(root.left, targetSum, currentSum);
        findPathSum(root.right, targetSum, currentSum);
    }
}
