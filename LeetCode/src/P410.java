public class P410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        int ans = splitArray(arr, k);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j);// for finding minimum answer in for this problem that is largest element in array
            end += j;
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // calculate how many pieces we can divide this array with max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
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
