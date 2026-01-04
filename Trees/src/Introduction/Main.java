package Introduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.preetyDisplay();

        BST tree = new BST();
        int[] nums = {4,6,1,89,45,32,17};
        tree.populate(nums);
        tree.display();
    }
}
