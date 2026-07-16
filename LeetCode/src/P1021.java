public class P1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    private static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                //If counter is > 0 meaning we already in the primitive bracket so just add it into the answer
                //If the counter is not increased so we are at the start of the primitive array so just increment the counter

                if (counter > 0)
                    sb.append(ch);
                counter++;
            } else if (ch == ')') {
                //We have to decrease the counter
                //If the counter is still > 0 than we are still in the primitive bracket so just add it into the ans
                //If the counter is 0 than we are at last position

                counter--;

                if (counter > 0)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}
