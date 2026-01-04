import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

//        stack.push(34);
//        stack.push(12);
//        stack.push(88);
//        stack.push(82);
//        stack.push(80);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        // Here stack.pop is of generic type means it will return the variable with different types of it.

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(5);
//        queue.add(12);
//        queue.add(73);
//        queue.add(19);
//        queue.add(20);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(76);
        deque.addFirst(32);
        deque.addLast(1);
        deque.removeFirst();
        //etc etc.

    }
}
