import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P94 {
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

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }

    private static void inOrder(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }

        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    private static List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        List<Integer> ans = new ArrayList<>();

        while (true) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                temp = stack.pop();
                ans.add(temp.val);
                temp = temp.right;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Testcase = [1,2,3,null,4]
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);

        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal2(root));
    }
}
