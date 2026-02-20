package Introduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.populate(scanner);
//        binaryTree.preetyDisplay();

        BST bst = new BST();
        int[] nums = {4, 6, 1, 89, 45, 32, 17};
        bst.populate(nums);
        bst.display();
    }
}
