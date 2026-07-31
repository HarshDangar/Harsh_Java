import java.util.Arrays;

public class P518 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(change(5, coins));
    }

    static int[][] dp;
    private static int change(int amount, int[] coins) {
        dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(amount, coins, 0);
    }

    private static int solve(int amount, int[] coins, int i) {
        if (amount == 0)
            return 1;

        if (i == coins.length || amount < 0)
            return 0;

        if (dp[i][amount] != -1)
            return dp[i][amount];

        //Skip the element if it is greater than the coin
        if(coins[i] > amount) {
            return dp[i][amount] = solve(amount, coins, i + 1);
        }

        int take = solve(amount - coins[i], coins, i);
        int skip = solve(amount, coins, i + 1);

        return dp[i][amount] = take + skip;
    }
}
