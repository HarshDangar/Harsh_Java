public class P1608 {
    public static void main(String[] args) {
        int[] arr = {0, 0};
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] nums) {
        bubble(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= n - i) {
                if (i == 0 || nums[i - 1] < n - i) {
                    return n - i;
                }
            }
        }
        return -1;
    }

    static void bubble(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
