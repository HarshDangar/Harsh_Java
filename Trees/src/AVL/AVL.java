package AVL;

public class AVL {
    public static class Node {
        private final int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {

    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    // These cases are written in prime book page 89
    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                /* Left-Left Case
                            P
                          C   t4
                        G   t3
                     t1   t2
                 */
                return rightRotate(node);
            }

            if (height(node.left.left) - height(node.left.right) < 0) {
                /* Left-Right Case
                            P
                          C   t4
                       t1   G
                         t2   t3
                 */
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            //right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                /* Right-Right Case
                            P
                         t1   C
                           t2   G
                             t3   t4
                 */
                return leftRotate(node);
            }

            if (height(node.right.left) - height(node.right.right) > 0) {
                /* Right-Left Case
                            P
                         t1   C
                            G   t4
                         t2   t3
                 */
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node p) {
        /*
                    P                C
                  C   t3     =>   t1   P
               t1   t2              t2   t3

               t1 and t3 are not going to change
         */

        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    private Node leftRotate(Node c) {
        /*
                C                   P
             t1   P         =>    C   t3
               t2   t3         t1   t2

               t1 and t3 is not going to change
         */
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }


    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
