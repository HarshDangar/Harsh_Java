

public class P1539_2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(findKthPositive(arr, 5));
    }

    private static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] - (mid + 1) < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start + k;
    }
}
