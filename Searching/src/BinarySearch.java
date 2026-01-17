public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 12, 23, 45, 55, 67, 88, 98, 100};
        int target = 55;
        System.out.println(binarySearch(nums, target));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
