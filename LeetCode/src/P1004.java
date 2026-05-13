public class P1004 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }

    private static int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int maxLength = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
