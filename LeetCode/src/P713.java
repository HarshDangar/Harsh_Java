public class P713 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    //Khandani Sliding Window
    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;

        if (k <= 1) { //k = 0, k = 1
            //It is not possible because nums[i] range is [1, 1000]
            return 0;
        }

        int i = 0;
        int j = 0;

        int count = 0;
        int product = 1;

        while (j < n) {
            product *= nums[j];

            while (product >= k) {
                product /= nums[i];
                i++;
            }

            count += (j - i + 1);
            j++;
            /*
                Number of subarrays ending at j,
                Almost like if the super array is frequent than all of its subarrays are also frequent,
                so we have to add that in the answer
             */
        }

        return count;
    }
}
