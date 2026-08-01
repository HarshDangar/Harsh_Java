import java.util.Arrays;

public class P53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, -8, -5, -6};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));
        System.out.println(Arrays.toString(subArrayPrint(arr)));
    }

    private static int maxSubArray(int[] nums) {
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
    private static int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // check for businessman to join in joint venture

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

    //Follow up Question : Print the subarray that has maximum sum
    private static int[] subArrayPrint(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
                tempStart = i;
            }

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}
