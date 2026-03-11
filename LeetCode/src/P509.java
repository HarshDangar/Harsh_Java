import java.util.Arrays;

public class P509 {
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibRec(7));
        System.out.println(fibDp(7));
        System.out.println(fibDPMem(7));
    }

    private static int fib(int n) {
        if (n <= 1) return n;

        int prev1 = 1;
        int prev2 = 0;
        int cur = 0;

        for (int i = 2; i <= n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }

    //Recursive approach
    private static int fibRec(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    //Dynamic Programming
    private static int fibDp(int n) {
        if (n <= 1)
            return n;

        int[] fib = new int[n + 1];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n - 1];
    }

    //Dynamic programming with memoization
    static int[] dp = new int[31];
    static {
        Arrays.fill(dp, -1);
    }

    private static int fibDPMem(int n) {
        if (n <= 1)
            return n;

        // Temporary variables to store values of fib(n-1) & fib(n-2)
        int first, second;

        if (dp[n - 1] != -1) {
            first = dp[n - 1];
        } else {
            first = fib(n - 1);
        }

        if (dp[n - 2] != -1) {
            second = dp[n - 2];
        } else {
            second = fib(n - 2);
        }

        // Memoization
        return dp[n] = first + second;
    }
}
