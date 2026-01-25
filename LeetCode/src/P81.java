public class P81 {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 1;
        System.out.println(search(arr, target));
    }

    private static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (nums[pivot] == target)
            return true;

        if (target >= nums[0] && pivot > 0) {
            return binarySearch(nums, target, 0, pivot);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    private static int findPivot(int[] arr) {
        int pivot = 0;
        int start = 0;

        while (start <= arr.length - 2) {
            if (arr[start + 1] < arr[start]) {
                pivot = start;
                break;
            }
            start++;
        }
        return pivot;
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
