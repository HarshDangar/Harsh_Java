public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0, end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            /* Here we don't directly update the start because we have to use previous start
               in to update the end so here new start is basically a temp.
               Double the box value
             */
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] nums, int target, int start, int end) {

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
