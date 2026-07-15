import java.util.Arrays;

public class P31 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,3,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {
        /*
            Step 1 : Find the break point
            For that traverse from the right if curr element is less than next element than it is the breakpoin
            If No break point found just reverse the array and return
         */

        int breakPoint = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        //Step 2 : Find the element in the right of breakpoint than is larger than breakpoint element
        for (int i = nums.length - 1; i > breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                swap(nums, i, breakPoint);
                break;
            }
        }

        //Reverse the array to the right of the breakpoint
        reverse(nums, breakPoint + 1, nums.length - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
