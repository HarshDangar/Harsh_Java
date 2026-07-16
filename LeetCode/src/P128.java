import java.util.Arrays;

public class P128 {
    public static void main(String[] args) {
        int[] nums = {100,4,101,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
            return 0;

        int lastSmallEle = Integer.MIN_VALUE;
        int currCount = 0; //Curr sequence length
        int max = 1; //Longest sequence length

        for (int i = 0; i < nums.length; i++) {
            //Case 1 : curr element is exactly one greater than lastSmallEle
            if (nums[i] - 1 == lastSmallEle) {
                currCount++;
                lastSmallEle = nums[i];
            } else if (nums[i] != lastSmallEle) {
                currCount = 1; //Reset the count
                lastSmallEle = nums[i];
            }

            max = Math.max(max, currCount);
        }
        return max;
    }
}
