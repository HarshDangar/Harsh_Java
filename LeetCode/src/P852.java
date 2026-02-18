
public class P852 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return arr[start];
    }
}
