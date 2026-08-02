import java.util.Arrays;

public class P1911 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 3};
        System.out.println(maxAlternatingSum(nums));
    }

    static int n;
    static long[][] dp = new long[1000001][2];
    private static long maxAlternatingSum(int[] nums) {
        n = nums.length;

        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, nums, 1);
        //1 reprsents true which represents isEven generally used for sign of the element
    }

    private static long solve(int idx, int[] nums, int flag) {
        if (idx >= n)
            return 0;

        if (dp[idx][flag] != -1) {
            return dp[idx][flag];
        }

        long skip = solve(idx + 1, nums, flag);
        //If we skip the element than the sign will not change because we have not take the element

        int val = nums[idx];
        if (flag == 0) {
            val *= -1;
        }
        //Here sign is changed because we are adding the element in the subsequence so sign needs to be changed

        long take = solve(idx + 1, nums, flag == 0 ? 1 : 0) + val;

        return dp[idx][flag] = Math.max(skip, take);
    }
}
