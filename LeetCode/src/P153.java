public class P153 {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int pivot = findPivot(nums);

        if (pivot == -1)
            return nums[0];
        else
            return nums[pivot + 1];
    }

    private static int findPivot(int[] arr) {
        int count = 0;
        int pivot;
        int start = 0;
        int end = arr.length - 1;

        while (arr[start] > arr[end] && start < end) {
            count++;
            start++;
        }
        pivot = count - 1;

        return pivot;
    }
}
