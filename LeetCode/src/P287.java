public class P287 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate2(arr));
    }

    private static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findDuplicate2(int[] nums) {
        int n = nums.length;
        boolean[] set = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (set[nums[i]])
                return nums[i];
            set[nums[i]] = true;
        }

        return -1;
    }
}
