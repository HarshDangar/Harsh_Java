public class P3418 {
    public static void main(String[] args) {
        int[][] coins = {{0,1,-1},{1,-2,3},{2,-3,4}};
        System.out.println(maximumAmount(coins));
    }

    static int m, n;
    static int[][][] dp;

    private static int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;

        dp = new int[m][n][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }

        return solve(coins, 0, 0, 2);
    }

    private static int solve(int[][] coins, int i, int j, int neu) {
        if (i >= m || j >= n) //Out of bound
            return Integer.MIN_VALUE;

        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && neu > 0) {
                return 0; //Neutralize robber
            }
            return coins[i][j];
        }

        // Memo
        if (dp[i][j][neu] != Integer.MIN_VALUE) {
            return dp[i][j][neu];
        }

        int best = Integer.MIN_VALUE;

        //Move Down
        int down = solve(coins, i + 1, j, neu);
        if (down != Integer.MIN_VALUE) {
            best = Math.max(best, coins[i][j] + down);
        }

        // Move Right
        int right = solve(coins, i, j + 1, neu);
        if (right != Integer.MIN_VALUE) {
            best = Math.max(best, coins[i][j] + right);
        }

        // Neutralize (skip negative)
        if (coins[i][j] < 0 && neu > 0) {
            int downSkip = solve(coins, i + 1, j, neu - 1);
            int rightSkip = solve(coins, i, j + 1, neu - 1);

            int skipBest = Math.max(downSkip, rightSkip);
            if (skipBest != Integer.MIN_VALUE) {
                best = Math.max(best, skipBest);
            }
        }

        return dp[i][j][neu] = best;
    }
}
