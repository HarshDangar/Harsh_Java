import java.util.Arrays;

public class P922 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    private static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int[] ans = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }
        return ans;
    }
}
