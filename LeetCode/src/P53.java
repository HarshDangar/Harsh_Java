public class P53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));
    }

    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Kaden's algorithm

    static int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // check for businessman to joint in joint venture

            if (sum >= 0) {
                sum += nums[i];
            } else {
                // start business with own money without any of help
                sum = nums[i];
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
