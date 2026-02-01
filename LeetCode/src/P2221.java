public class P2221 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }

    private static int triangularSum(int[] nums) {
        for (int i = nums.length; i > 1; i--) {
            int[] newSum = new int[i - 1];
            for (int j = 0; j < newSum.length; j++) {
                newSum[j] = (nums[j] + nums[j + 1]) % 10;
            }
            nums = newSum;
        }
        return nums[0];
    }
}
