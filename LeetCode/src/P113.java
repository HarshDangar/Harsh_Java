import java.util.ArrayList;
import java.util.List;

public class P113 {
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


    private static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        collectPaths(root, targetSum, temp, result);
        return result;
    }

    private static void collectPaths(TreeNode root, int targetSum, List<Integer> temp, List<List<Integer>> result) {
        if (root == null)
            return;

        temp.add(root.val);

        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(temp));
        }

        collectPaths(root.left, targetSum - root.val, temp, result);
        collectPaths(root.right, targetSum - root.val, temp, result);

        temp.removeLast();
    }
}
