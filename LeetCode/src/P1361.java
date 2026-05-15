import java.util.*;

public class P1361 {
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

    private static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Map<Integer, List<Integer>> parentToChildren = new HashMap<>();
        Map<Integer, Integer> childToParent = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int node = i;
            int leftChildNode = leftChild[i];
            int rightChildNode = rightChild[i];

            //If value is -1 than we have to ignore because it will be null
            if (leftChildNode != -1) {
                //Here we add node to check further with bfs
                parentToChildren.computeIfAbsent(node, k -> new ArrayList<>()).add(leftChildNode);

                //If child already has parent
                if (childToParent.containsKey(leftChildNode)) {
                    return false;
                } else {
                    childToParent.put(leftChildNode, node);
                }
            }

            if (rightChildNode != -1) {
                parentToChildren.computeIfAbsent(node, k -> new ArrayList<>()).add(rightChildNode);

                if (childToParent.containsKey(rightChildNode)) {
                    return false;
                } else {
                    childToParent.put(rightChildNode, node);
                }
            }
        }

        /*Now we find the root node
            the node which dont have any parent will be root node
            if there are more than one node which have no parent than the tree will not formed
         */
        int root = -1;

        for (int i = 0; i < n; i++) {
            if (!childToParent.containsKey(i)) {
                if (root != -1) { //more than one empty parent nodes
                    return false;
                } else {
                    root = i;
                }
            }
        }
        //No node found as root
        if (root == -1)
            return false;

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        int count = 1; //Node count
        queue.add(root);
        visited[root] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int child : parentToChildren.getOrDefault(node, Collections.emptyList())) {
                if (!visited[child]) {
                    visited[child] = true;
                    count++;
                    queue.add(child);
                }
            }
        }

        return count == n; // we should be able to visit all nodes during BFS/DFS
    }
}
