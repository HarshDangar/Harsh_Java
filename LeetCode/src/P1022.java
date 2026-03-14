public class P1022 {
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
    private static int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    private static int helper(TreeNode node, int sum) {
        if (node == null)
            return 0;

        sum = (sum << 1) + node.val;

        if (node.left == null && node.right == null)
            return sum;

        return helper(node.left, sum) + helper(node.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(sumRootToLeaf(root));
    }
}
