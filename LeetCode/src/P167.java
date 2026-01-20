import java.util.Arrays;

public class P167 {
    private static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int total = numbers[start] + numbers[end];

            if (total == target) {
                return new int[]{start + 1, end + 1};
            } else if (total < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0};
        System.out.println(Arrays.toString(twoSum(nums, -1)));
    }
}
