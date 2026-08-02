import java.util.Arrays;

public class P300 {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(nums));
    }

    static int n;
    static int[][] dp = new int[2501][2501];
    private static int lengthOfLIS(int[] nums) {
        n = nums.length;

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, 0, -1);
    }

    private static int solve(int[] nums, int curr, int prev) {
        //prev is index of the previous taken element initially -1
        if (curr >= n) {
            return 0;
        }

        if (prev != -1 && dp[curr][prev] != -1) {
            return dp[curr][prev];
        }

        int pick = 0;
        if (prev == -1 || nums[curr] > nums[prev]) {
            pick = 1 + solve(nums, curr + 1, curr);
        }

        int skip = solve(nums, curr + 1, prev);

        if (prev != -1)
            dp[curr][prev] = Math.max(pick, skip);

        return Math.max(pick, skip);
    }
}
