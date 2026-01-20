public class P74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            int start = 0;
            int end = arr.length - 1;

            if (target >= arr[start] && target <= arr[end]) {
                return binarySearch(arr, target);
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
