import java.util.Arrays;

public class P2149 {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    private static int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];

        int idx_p = 0;
        int idx_n = 1;

        for (int num: nums) {
            if (num > 0) {
                res[idx_p] = num;
                idx_p += 2;
            } else {
                res[idx_n] = num;
                idx_n += 2;
            }
        }
        return res;
    }
}
