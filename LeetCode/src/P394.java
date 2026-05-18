import java.util.Stack;

public class P394 {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    private static String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr_str = new StringBuilder();
        int curr_num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                curr_num = curr_num * 10 + (c - '0');
            } else if (c == '[') {
                integerStack.push(curr_num);
                curr_num = 0;
                stringStack.push(curr_str);
                curr_str = new StringBuilder();
            } else if (c == ']') {
                int k = integerStack.pop();
                StringBuilder temp = curr_str;
                curr_str = stringStack.pop();

                while (k-- > 0) {
                    curr_str.append(temp);
                }
            } else {
                curr_str.append(c);
            }
        }
        return curr_str.toString();
    }
}
