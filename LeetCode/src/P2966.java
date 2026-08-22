import java.util.Arrays;

public class P2966 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11};
        int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }

    private static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int[][] result = new int[n / 3][3];
        int row = 0;

        for (int i = 0; i <= n - 3; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }
            result[row++] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
        }

        return result;
    }
}
