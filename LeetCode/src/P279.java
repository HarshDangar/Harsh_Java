import java.util.Arrays;

public class P279 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }

    static int[] dp = new int[10001];

    private static int numSquares(int n) {
        Arrays.fill(dp, -1);

        return solve(n);
    }

    private static int solve(int target) {
        if (target == 0)
            return 0;

        if (dp[target] != -1)
            return dp[target];

        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= target; i++) {
            minCount = Math.min(minCount, 1 + solve(target - i * i));
        }

        return dp[target] = minCount;
    }
}
