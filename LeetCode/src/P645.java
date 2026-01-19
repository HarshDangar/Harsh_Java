import java.util.Arrays;

public class P645 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums2(arr)));
    }

    //Approach 1
    static int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                int correct = index + 1;
                return new int[]{nums[index], correct};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //Approach 2
    public static int[] findErrorNums2(int[] nums) {
        int missing = -1, duplicate = -1;
        int[] arr = new int[nums.length];

        for (int i : nums) {
            arr[i - 1]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == 0) {
                missing = i + 1;
            } else if (arr[i] == 2) {
                duplicate = i + 1;
            }
        }

        return new int[]{duplicate, missing};
    }
}
