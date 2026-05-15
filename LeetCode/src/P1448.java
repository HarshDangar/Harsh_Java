public class P1448 {
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

    private static int goodNodes(TreeNode root) {
        return helper(root, 0, Integer.MIN_VALUE);
    }

    private static int helper(TreeNode root, int ans, int currMax) {
        if (root == null)
            return 0;

        int rootAns = 0;

        if (root.val >= currMax) {
            rootAns = 1;
            currMax = root.val;
        }

        int leftAns = helper(root.left, ans, currMax);
        int rightAns = helper(root.right, ans, currMax);

        return leftAns + rightAns + rootAns;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(goodNodes(root));
    }
}
