public class P116 {
    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;

        /* If leftmost node's left is null than there will be no node on that level and after level also
            because we are given perfect binary tree
            Perfect Binary Tree Property: All nodes have two children and all level are also filled
         */

        /*
            Example:     1
                      2     3
                    4   5 6   7
         */
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                // If is used for joining 5 -> 6 meaning bridge between right of one node to left of next node on the level
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                //After this we need to go to on the next node
                current = current.next;
            }
            //Leftmost is previous leftmost's left
            leftMost = leftMost.left;
        }
        return root;
    }
}