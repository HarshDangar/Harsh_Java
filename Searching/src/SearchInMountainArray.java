

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 3, 1};
        int target = 3;
        int peak = peakIndexInMountainArray(nums);
        int ans = orderAgnosticBS(nums, target, 0, peak);

        if (ans == -1) {
            ans = orderAgnosticBS(nums, target, peak + 1, nums.length-1);
        }

        System.out.println(ans);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
