import java.util.Arrays;

public class P27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        int[] ans = nums.clone();
        int startIndex = 0;
        int lastIndex = nums.length - 1;

        for (int num : ans) {
            if (num != val) {
                nums[startIndex] = num;
                startIndex++;
                count++;
            } else {
                nums[lastIndex] = -1;
                lastIndex--;
            }
        }
        return count;
    }
}
