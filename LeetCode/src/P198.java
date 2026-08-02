import java.util.Arrays;

public class P198 {
    public static void main(String[] args) {
        int[] nums = {40, 2, 4, 10};
        System.out.println(rob(nums));
        System.out.println(rob2(nums));
    }

    //Company : Amazon, OYO Rooms, Paytm, Walmart, Google, Flipkart, LinkedIn, Airbnb
    //Approach 1 : Top Down
    static int[] t = new int[101];
    private static int rob(int[] nums) {
        int n = nums.length;

        Arrays.fill(t, -1);

        return solve(nums, 0, n);
    }

    private static int solve(int[] nums, int i, int n) {
        if (i >= n) //Out of bound
            return 0;

        if (t[i] != -1)
            return t[i];

        int steal = nums[i] + solve(nums, i + 2, n);
        int skip = solve(nums, i + 1, n);
        //But without memoization many recursion calls are overlapping
        //So we use dp (recursion + memoization)

        return t[i] = Math.max(steal, skip);
    }

    //Approach 2 : Bottom UP
    private static int rob2(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] t = new int[n + 1];
        //t[i] = max stolen money till i house

        //No house => i = 0
        t[0] = 0;

        //1 house : i = 1
        t[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            int steal = nums[i - 1] + t[i - 2];
            int skip = t[i - 1];

            t[i] = Integer.max(steal, skip);
        }
        return t[n];
    }
}
