import java.util.Arrays;

public class P70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(climbStairs(45));
    }

    private static int climbStairs(int n) {
        if (n <= 3) return n;

        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;

        for (int i = 4; i <= n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }

    //Recursion + Memoization
    static int[] dp;
    private static int climpStairs2(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -2);
        return solve(n);
    }

    private static int solve(int n) {
        if(n == 0) {
            return 1;
        }

        if (n < 0)
            return 0;

        if (dp[n] != -2)
            return dp[n];

        return dp[n] = solve(n - 1) + solve(n - 2);
    }
}
