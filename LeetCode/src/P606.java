public class P606 {
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

    private static String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = Integer.toString(root.val);

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if (root.left == null && root.right == null)
            return result;

        if (root.right == null)
            return result + "(" + left + ")";

        if (root.left == null)
            return result + "()" + "(" + right + ")";

        return result + "(" + left + ")" + "(" + right + ")";
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);

        System.out.println(tree2str(root));
    }
}
