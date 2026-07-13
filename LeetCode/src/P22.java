import java.util.ArrayList;
import java.util.List;

public class P22 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(generateParenthesis(n));
        System.out.println(generateParenthesis2(n));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, 0, result);
        return result;
    }

    private static void generate(String curr, int n, int length, List<String> result) {
        if (curr.length() == 2 * n) {
            if (isValid(curr))
                result.add(curr);
            return;
        }

        curr += '(';
        generate(curr, n, length + 1, result);
        curr = curr.substring(0, curr.length() - 1); //Removing last index

        curr += ')';
        generate(curr, n, length + 1, result);
    }

    private static boolean isValid(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                sum++;
            else
                sum--;
            if (sum < 0)
                return false;
        }
        return sum == 0;
    }

    //Approach 2 : With directly checking open and close bracket count
    static private final List<String> result = new ArrayList<>();
    private static List<String> generateParenthesis2(int n) {
        solve(n, "", 0, 0);
        return result;
    }

    private static void solve(int n, String curr, int open, int close) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            curr += '(';
            solve(n, curr, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        if (close < open) {
            curr += ')';
            solve(n, curr, open, close + 1);
        }
    }
}
