public class P1464 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};
        System.out.println(maxProduct2(nums));
    }

    private static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    max = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return max;
    }

    private static int maxProduct2(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
