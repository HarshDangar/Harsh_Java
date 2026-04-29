import java.util.Arrays;

public class P1877 {
    public static void main(String[] args) {
        int[] nums = {3,5,5,2,4,6};
        System.out.println(minPairSum(nums));
    }

    private static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        int result = 0;

        while (i < j) {
            int sum = nums[i] + nums[j];
            result = Math.max(result, sum);
            i++;
            j--;
        }
        return result;
    }
}
