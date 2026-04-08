import java.util.Arrays;

public class P1679 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 6;
        System.out.println(maxOperations(nums, k));
    }

    private static int maxOperations(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);

        while (start < end) {
            if (nums[start] + nums[end] < k) {
                start++;
            } else if (nums[start] + nums[end] > k) {
                end--;
            } else {
                ans++;
                start++;
                end--;
            }
        }
        return ans;
    }
}
