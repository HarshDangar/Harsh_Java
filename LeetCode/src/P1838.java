import java.util.Arrays;

public class P1838 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        System.out.println(maxFrequency2(nums, k));
    }

    //Approach 1 : Binary search, Prefix Sum
    private static int findBest(int targetIdx, int k, int[] nums, long[] prefixSum) {
        int target = nums[targetIdx];

        int i = 0;
        int j = targetIdx;
        int result = targetIdx;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            long count = (targetIdx - mid + 1);
            long windowSum = (count * target);
            long currSum = prefixSum[targetIdx] - prefixSum[mid] + nums[mid];

            int ops = (int) (windowSum - currSum);

            if (ops > k) {
                i = mid + 1;
            } else {
                result = mid;
                j = mid - 1;
            }
        }

        return targetIdx - result + 1;
    }

    private static int maxFrequency(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, findBest(i, k, nums, prefixSum));
        }

        return result;
    }

    //Approach 2 : Sliding Window
    private static int maxFrequency2(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;

        int i = 0;
        long currSum = 0;

        for (int j = 0; j < n; j++) {

            long target = nums[j];
            currSum += nums[j];

            //Total element in the window into target

            if ((j - i + 1) * target - currSum > k) {
                //We have to shrink the window
                currSum -= nums[i];
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
