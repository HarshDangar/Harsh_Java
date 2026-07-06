public class P3689 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 1};
        int k = 3;
        System.out.println(maxTotalValue(nums, k));
    }

    private static long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return (long) k * (max - min);
    }
}
