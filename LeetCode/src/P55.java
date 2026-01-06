public class P55 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        int index = goal - 1;

        while (goal >= 0 && index >= 0) {
            if (nums[index] + index >= goal) {
                goal = index;
            }
            index--;
        }
        return goal == 0;
    }
}
