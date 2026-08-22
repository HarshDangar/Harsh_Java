import java.util.Arrays;

public class P268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(MissingNumber(arr));
        System.out.println(MissingNumber2(arr));
        System.out.println(MissingNumber3(arr));
    }

    private static int MissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int MissingNumber2(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    private static int MissingNumber3(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int result = nums.length;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > mid) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}
