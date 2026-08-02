import java.util.Arrays;

public class P213 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    //Recurstion + Memoization
    static int[] t = new int[101];
    private static int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        if (n == 2)
            return Math.max(nums[0], nums[1]);

        Arrays.fill(t, -1);

        // Case 1: take the first house
        int takeFirst = solve(nums, 0, n - 2);
        // Case 2: take last house
        Arrays.fill(t, -1);
        int takeLast = solve(nums, 1, n - 1);

        return Math.max(takeFirst, takeLast);
    }

    private static int solve(int[] nums, int i, int n) {
        if (i > n) //Out of bound
            return 0;

        if (t[i] != -1)
            return t[i];

        int steal = nums[i] + solve(nums, i + 2, n);
        int skip = solve(nums, i + 1, n);

        return t[i] = Math.max(steal, skip);
    }
}
