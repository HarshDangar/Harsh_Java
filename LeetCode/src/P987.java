import java.util.*;

public class P987 {
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

    private List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (node == null) {
            return ans;
        }

        int col = 0;

        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        return ans;
    }
}
