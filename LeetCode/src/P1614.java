public class P1614 {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {
        int counter = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                counter++;
            else if (ch == ')')
                counter--;

            ans = Math.max(ans, counter);
        }
        return ans;
    }
}
