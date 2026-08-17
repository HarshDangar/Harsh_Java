import java.util.Arrays;

public class P1913 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(nums));
        System.out.println(maxProductDifference2(nums));
    }

    private static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE; //Max
        int max2 = Integer.MIN_VALUE; //Second max

        int min1 = Integer.MAX_VALUE; //Min
        int min2 = Integer.MAX_VALUE; //Second min

        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    private static int maxProductDifference2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }
}
