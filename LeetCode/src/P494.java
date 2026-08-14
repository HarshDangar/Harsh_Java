import java.util.Arrays;

public class P494 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(findTargetSumWays(nums, target));
        System.out.println(findTargetSumWays2(nums, target));
    }

    private static int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    private static int solve(int[] nums, int target, int index, int sum) {
        if (index == nums.length)
            return sum == target ? 1 : 0;

        //Positive
        int positive = solve(nums, target, index + 1, sum + nums[index]);
        int negative = solve(nums, target, index + 1, sum - nums[index]);

        return positive + negative;
    }

    //Here sum can be in minus so classic dp memoization will not work
    static int S;

    private static int findTargetSumWays2(int[] nums, int target) {
        int n = nums.length;
        S = Arrays.stream(nums).sum();
        int[][] dp = new int[n][2 * S + 1];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return solve(nums, target, 0, 0, dp);
    }

    private static int solve(int[] nums, int target, int index, int sum, int[][] dp) {
        if (index == nums.length)
            return sum == target ? 1 : 0;

        //Here sum + S will make largest negative ans to 0 so we can use that answer and put it in index 0
        if (dp[index][sum + S] != Integer.MIN_VALUE) {
            return dp[index][sum + S];
        }

        int positive = solve(nums, target, index + 1, sum + nums[index], dp);
        int negative = solve(nums, target, index + 1, sum - nums[index], dp);

        return dp[index][sum + S] = positive + negative;
    }
}
