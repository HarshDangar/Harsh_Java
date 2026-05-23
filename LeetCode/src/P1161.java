import java.util.LinkedList;
import java.util.Queue;

public class P1161 {
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

    private static int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int max_sum = Integer.MIN_VALUE;
        int max_idx = 1;
        int level = 1;

        while (!queue.isEmpty()) {
            int n = queue.size();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();

                sum += temp.val;

                if (temp.left != null)
                    queue.offer(temp.left);

                if (temp.right != null)
                    queue.offer(temp.right);
            }
            if (sum > max_sum) {
                max_sum = sum;
                max_idx = level;
            }
            level++;
        }

        return max_idx;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        root.right = new TreeNode(0);

        System.out.println(maxLevelSum(root));
    }
}
