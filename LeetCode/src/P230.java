public class P230 {
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

    private static int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    static int count = 0;
    private static TreeNode helper(TreeNode root, int k) {
        if (root == null)
            return null;

        TreeNode left = helper(root.left, k);

        if (left != null)
            return left;
        count++;

        if (count == k)
            return root;

        return helper(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        System.out.println(kthSmallest(root, 3));
    }
}
