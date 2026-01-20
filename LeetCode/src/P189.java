import java.util.Arrays;

public class P189 {
    public static void main(String[] args) {
        int[] nums = {1};
        rotate(nums, 0);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}
