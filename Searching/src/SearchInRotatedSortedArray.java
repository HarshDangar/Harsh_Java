

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,2};
        int target = 3;
        System.out.println(searching(nums, target));
    }

    static int findPivot(int[] arr) {
        int count = 0;
        int pivot;
        int start = 0;
        int end = arr.length-1;

        while (arr[start] > arr[end] && start < end) {
            count++;
            start++;
        }
        pivot = count - 1;

        return pivot;
    }

    static int searching(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return binarysearch(arr, target, 0, arr.length-1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0] && pivot>0) {
            return binarysearch(arr, target, 0, pivot-1);
        }
        return binarysearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarysearch(int[] arr , int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
