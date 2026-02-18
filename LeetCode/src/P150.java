import java.util.Stack;

public class P150 {
    public static void main(String[] args) {
        String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(arr));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();

                switch (token) {
                    case "+" ->
                        stack.push(first + second);
                    case "-" ->
                        stack.push(first - second);
                    case "*" ->
                        stack.push(first * second);
                    case "/" ->
                        stack.push(first / second);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
