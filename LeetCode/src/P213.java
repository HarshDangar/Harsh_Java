import java.util.Arrays;

public class P213 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
        System.out.println(rob2(nums));
        System.out.println(rob3(nums));
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

    //Bottom Up
    private static int rob2(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] t = new int[n + 1];
        //t[i] = money stolen when you have i houses

        t[0] = 0;

        //Case 1 : Take first house - hence skip the last house
        for (int i = 1; i <= n - 1; i++) {
            int skip = t[i - 1];

            int take = nums[i - 1] + (i - 2 >= 0 ? t[i - 2] : 0);

            t[i] = Math.max(skip, take);
        }

        int result1 = t[n - 1];

        Arrays.fill(t, 0);

        //Case 2 : Skip the first house - hence we can pick the last house
        t[0] = 0;
        t[1] = 0;

        for (int i = 2; i <= n; i++) {
            int skip = t[i - 1];

            int pick = nums[i - 1] + (i - 2 >= 0 ? t[i - 2] : 0);

            t[i] = Math.max(skip, pick);
        }
        int result2 = t[n];

        return Math.max(result1, result2);
    }

    //Constant space
    private static int rob3(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        if (n == 2)
            return Math.max(nums[0], nums[1]);

        int takeFirst = solve2(nums, 0, n - 2);
        int takeLast = solve2(nums, 1, n - 1);

        return Math.max(takeFirst, takeLast);
    }

    private static int solve2(int[] nums, int l, int r) {
        int prev = 0;
        int prevPrev = 0;

        for (int i = l; i <= r; i++) {
            int skip = prev;
            int take = nums[i] + prevPrev;

            int temp = Math.max(skip, take);

            prevPrev = prev;
            prev = temp;
        }
        return prev;
    }
}
