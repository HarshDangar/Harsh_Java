import java.util.Arrays;

public class P905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int i = 0;
        int j = nums.length - 1;
        int[] ans = new int[nums.length];

        while (i <= j) {
            if (nums[index] % 2 == 0) {
                ans[i] = nums[index];
                i++;
            } else {
                ans[j] = nums[index];
                j--;
            }
            index++;
        }
        return ans;
    }
}
