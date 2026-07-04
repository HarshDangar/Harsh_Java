import java.util.ArrayList;
import java.util.List;

public class P386 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    private static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for (int startNum = 1; startNum <= 9; startNum++) {
            solve(startNum, n, result);
        }

        return result;
    }

    private static void solve(int curr, int n, List<Integer> result) {
        if (curr > n)
            return;

        result.add(curr);

        for (int append = 0; append <= 9; append++) {
            int newNum = curr * 10 + append;

            if (newNum > n)
                return;

            solve(newNum, n, result);
        }
    }
}
