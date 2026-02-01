public class P3010 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,12};
        System.out.println(minimumCost(nums));
    }

    private static int minimumCost(int[] nums) {
        int sum = nums[0];
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val < secondSmallest) {
                secondSmallest = val;
            }
        }
        sum += smallest + secondSmallest;
        return sum;
    }
}
