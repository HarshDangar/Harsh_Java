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

    static int counter = 0;
    private static int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        helper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return counter;
    }

    private static void helper(TreeNode root, int sum, long currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (currentSum == sum) {
            counter++;
        }
        helper(root.left, sum, currentSum);
        helper(root.right, sum, currentSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1000000000);
        root.left = new TreeNode(1000000000);
        root.left.left = new TreeNode(294967296);
        root.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left.left = new TreeNode(1000000000);

        System.out.println(pathSum(root, 0));
    }
}
