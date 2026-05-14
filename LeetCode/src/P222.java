public class P222 {
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

    private static int countNodes(TreeNode root) {
        return nullCounter(root) - 1;
    }

    //Total nodes will be null counter - 1
    private static int nullCounter(TreeNode root) {
        if (root == null)
            return 1;

        int left = nullCounter(root.left);
        int right = nullCounter(root.right);

        return left + right;
    }

    //Approach 2
    private static int countNodes2(TreeNode root) {
        if (root == null) return 0;

        return solve(root);
    }

    private static int solve(TreeNode root) {
        if (root == null)
            return 0;

        int total = 0;

        total += solve(root.left);
        total += solve(root.right);

        return total + 1;
    }

    //Approach 3
    private static int countNodes3(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + countNodes3(root.left) + countNodes3(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(8);

        System.out.println(countNodes3(root));
    }
}
