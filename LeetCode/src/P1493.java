public class P1493 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(nums));
    }

    //Approach - 1 : Brute Force gives TLE
    private static int longestSubarray(int[] nums) {
        int n = nums.length;

        int result = 0;
        int countZero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                countZero++;
                result = Math.max(result, findMax(nums, i));
            }
        }
        if (countZero == 0) { //All element are 1's
            return n - 1;
        }
        return result;
    }

    private  static int findMax(int[] nums, int skip_idx) {
        int currLength = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == skip_idx) {
                continue;
            }

            if (nums[i] == 1) {
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 0;
            }
        }
        return maxLength;
    }

    //Approach - 2 : Sliding Window
    public int longestSubarray2(int[] nums) {
        int zeroCount = 0;
        int maxLength = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            maxLength = Math.max(maxLength, j - i);
        }
        return maxLength;
    }

    //Approach 3 - Cleaner Sliding Window
    public int longestSubarray3(int[] nums) {
        int i = 0;
        int j = 0;
        int lastZeroIndex = -1;

        int result = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                i = lastZeroIndex + 1;
                lastZeroIndex = j;
            }

            result = Math.max(result, j - i);
            j++;
        }
        return result;
    }
}
