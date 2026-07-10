import java.util.Arrays;

public class P3634 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 9};
        int k = 3;
        System.out.println(minRemoval(nums, k));
    }

    private static int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int maxLen = 1;

        for (int j = 0; j < n; j++) {
            long max = nums[j];
            long min = nums[i];

            while (i < j && max > (long) k * min) {
                i++;
                min = nums[i];
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return n - maxLen;
    }
}
