import java.util.Arrays;

public class P75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
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

    //Approach 2 : Dutch National Flag Algorithm
    private static void sortColors2(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;

        while (mid <= end) {
            //If current ele is 0 than swap with start and move both start and mid
            if (nums[mid] == 0) {
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;

                start++;
                mid++;
            } else if (nums[mid] == 1) {
                //If mid is 1 than it is at correct position so just move mid
                mid++;
            } else {
                //If the element is 2 than swap with end and move end
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;

                end--;
            }
        }
    }
}
