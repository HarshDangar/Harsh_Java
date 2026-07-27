import java.util.Arrays;

public class P322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 7};
        System.out.println(coinChange(coins, 12));
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
}
