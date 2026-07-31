import java.util.Arrays;

public class P322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 7};
        System.out.println(coinChange2(coins, 12));
    }

    private static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // amount + 1 represents "infinity"
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    //Approach 2: Very slow but it works
    static int ans = Integer.MAX_VALUE;
    static int[][] dp;
    private static int coinChange2(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        solve(coins, amount, 0, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private static void solve(int[] coins, int amount, int curr, int currCoins) {
        if (amount == 0) {
            ans = Math.min(ans, currCoins);
            return;
        }

        if (curr == coins.length || amount < 0)
            return;

        if (dp[curr][amount] != -1 && dp[curr][amount] <= currCoins)
            return;

        dp[curr][amount] = currCoins;

        //Pick the coin
        solve(coins, amount - coins[curr], curr, currCoins + 1);
        solve(coins, amount, curr + 1, currCoins);
    }
}
