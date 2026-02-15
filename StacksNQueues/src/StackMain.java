public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new DynamicStack();

        stack.push(34);
        stack.push(12);
        stack.push(88);
        stack.push(82);
        stack.push(80);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // Here it will give Exception with CustomStack only.
    }
}
