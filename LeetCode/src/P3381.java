public class P3381 {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 4;
        System.out.println(maxSubarraySum(nums, k));
    }

    //Kaden's Algorithm
    private static long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long[] prefSum = new long[n];
        prefSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + nums[i];
        }

        long result = Long.MIN_VALUE;

        for (int start = 0; start < k; start++) {
            //We are taking start < k because subarrays are repeating
            long currSum = 0;

            int i = start;
            while (i < n && i + k - 1 < n) { //i + k - 1 == j
                int j = i + k - 1;

                long subSum = prefSum[j] - (i > 0 ? prefSum[i - 1] : 0);

                currSum = Math.max(subSum, currSum + subSum);

                result = Math.max(result, currSum);

                i += k;
            }
        }
        return result;
    }
}
