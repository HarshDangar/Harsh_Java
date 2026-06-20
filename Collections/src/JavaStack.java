import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        /*
            Stack extends Vector
            Last In First Out Principle
            Inheritance : Stack is subclass of Vector, which means it inherits all the features of a dynamic array
            but constrained by stack's LIFO nature.
            Stack is also thread safe
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer pop = stack.pop(); //Pop removes the top element and returns the element
        System.out.println(pop);

        System.out.println(stack);

        Integer peek = stack.peek(); //Peek will return the top element but element is not removed
        System.out.println(peek);

        System.out.println(stack.search(2)); //Returns the distance from the top of the stack starting from 1


    }
}
