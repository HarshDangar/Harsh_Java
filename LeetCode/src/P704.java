public class P704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int res = search(nums, target);
        if (res == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at " + res);

        //Problem is solved with using recursion
    }

    private static int search(int[] nums, int target) {
        int result = find(nums, 0, nums.length - 1, target);
        return result;
    }

    private static int find(int[] arr, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                return find(arr, start, mid - 1, target);
            else
                return find(arr, mid + 1, end, target);
        }
        return -1;
    }
}
