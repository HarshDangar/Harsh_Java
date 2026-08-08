import java.util.ArrayList;
import java.util.List;

public class P144 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }

    private static void preOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    public static void main(String[] args) {
        // Testcase = [1,2,3,null,4]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }
}
