import java.util.Arrays;

public class P1470 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int x = arr.length / 2;
        System.out.println(Arrays.toString(shuffle(arr, x)));

    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int l = 0;

        for (int i = 0; i < n; i++) {
            ans[l] = nums[i];
            l += 2;
        }
        l = 0;
        for (int i = 0; i < n; i++) {
            ans[l + 1] = nums[i + n];
            l += 2;
        }

        return ans;
    }
}
