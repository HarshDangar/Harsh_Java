import java.util.Arrays;

public class P377 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
        System.out.println(combinationSum4_2(nums, target));
    }

    static int[][] dp;
    private static int combinationSum4(int[] nums, int target) {
        dp = new int[1001][201];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, target, 0);
    }

    private static int solve(int[] nums, int target, int idx) {
        if (target == 0)
            return 1;

        if (idx >= nums.length || target < 0)
            return 0;

        if (dp[target][idx] != -1)
            return dp[target][idx];

        int pick = solve(nums, target - nums[idx], 0);
        int skip = solve(nums, target, idx + 1);

        return dp[target][idx] = pick + skip;
    }

    //Approach 2:
    static int[] dp2;
    private static int combinationSum4_2(int[] nums, int target) {
        dp2 = new int[target + 1];
        Arrays.fill(dp2, -1);
        return solve(nums, target);
    }

    private static int solve(int[] nums, int target) {
        if (target == 0)
            return 1;

        if (target < 0)
            return 0;

        if (dp2[target] != -1)
            return dp2[target];

        int result = 0;
        //Here skip part is done through for loop
        for (int i = 0; i < nums.length; i++) {
            result += solve(nums, target - nums[i]);
        }

        return dp2[target] = result;
    }
}
