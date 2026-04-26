public class P209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        int i = 0, j = 0;
        int minL = n + 1;
        int sum = 0;

        while (j < n) {
            sum += nums[j];

            //We are reducing the window size
            while (sum >= target) {
                minL = Math.min(minL, j - i + 1);
                sum -= nums[i]; //we have to reduce the sum because we are not adding the i'th element in the sum in next step
                i++; //right shift of i
            }
            j++;
        }
        return minL == n + 1 ? 0 : minL;
    }
}
