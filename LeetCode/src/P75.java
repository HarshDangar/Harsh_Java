import java.util.Arrays;

public class P75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = 1;
        }

        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] == 0) {
                arr[start] = 0;
                start++;
            } else if (nums[index] == 2) {
                arr[end] = 2;
                end--;
            }
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}
