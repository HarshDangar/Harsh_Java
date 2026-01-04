

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 3;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);


        if (pivot == -1) {
            return orderAgnosticBS(nums, target, 0, nums.length-1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0] && pivot>0) {
            return orderAgnosticBS(nums, target, 0, pivot-1);
        }

        return orderAgnosticBS(nums, target, pivot+1, nums.length-1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (mid<end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(mid>start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target , int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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
