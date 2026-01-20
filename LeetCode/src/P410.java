public class P410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        int ans = splitArray(arr, k);
        System.out.println(ans);
    }

    private static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            // the minimum answer for this problem will be the largest element in the array (n = array.length partition)
            end += num;
            // the max answer will be total of the array (n = 1 partition)
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // calculate how many pieces we can divide this array with max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // We cannot add this to this subarray we have to make another
                    //Means new sum will start from the num itself (next element in the array)
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // in last both become same so we can also write end
    }
}
