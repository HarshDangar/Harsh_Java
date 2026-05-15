import java.util.LinkedList;
import java.util.Queue;

public class P111 {
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

    //Approach 1 : DFS
    private static int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
    }

    //Approach 2 : BFS
    private static int minDepth2(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();

                if (temp.left == null && temp.right == null)
                    return depth;

                if (temp.left != null)
                    queue.offer(temp.left);

                if (temp.right != null)
                    queue.offer(temp.right);
            }
            depth++;
        }
        return -1;
    }
}
