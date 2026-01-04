package Introduction;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        // suppose root node value is 15 than here node.value is saying 15. And asking if you want to enter left of 15.

        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of left of " + node.value);
            //Enter the value of left of 15.

            int value = scanner.nextInt(); // Value is taken from user
            node.left = new Node(value); // It is placed in node which is left from root node
            populate(scanner, node.left); // Recursion call for adding further value where the root node is the value that is added now.
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root , "");
    }

    private void display(Node node , String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preetyDisplay(){
        preetyDisplay(root , 0);
    }

    private void preetyDisplay(Node node, int level){
        if (node == null){
            return;
        }

        preetyDisplay(node.right , level+1);

        if (level != 0){
            for (int i = 0; i < level-1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        preetyDisplay(node.left , level+1);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }
}
