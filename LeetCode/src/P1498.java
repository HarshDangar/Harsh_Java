import java.util.Arrays;

public class P1498 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        System.out.println(numSubseq(nums, target));
    }

    private static final int M = 1_000_000_007;
    private static int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] power = new int[n];
        power[0] = 1; //Here power index represent 2 ^ i exa 0 index mean 2 ^ 0 == 1

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % M;
        }

        int l = 0, r = n - 1;
        int result = 0;

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                result = (result + power[r - l]) % M;
                //Here Math.Pow() function is taking to much time that's why it is giving TLE
                //SO we can precompute the power because we know max of 2 power
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
}
