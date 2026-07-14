public class P1752 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }

    private static boolean check(int[] nums) {
        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            //Just check if element is greater than next index element
            //If this happen more than one time than array is not sorted otherwise it is sorted
            if (nums[i] > nums[(i + 1) % nums.length]) {
                if (check)
                    return false;
                check = true;
            }
        }
        return true;
    }
}
