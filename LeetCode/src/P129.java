public class P129 {
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

    private static int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    private static int helper(TreeNode node, int sum) {
        if (node == null)
            return 0;

        sum = (sum * 10) + node.val;

        if (node.left == null && node.right == null)
            return sum;

        return helper(node.left, sum) + helper(node.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);

        System.out.println(sumNumbers(root));
    }
}
