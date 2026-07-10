public class P2997 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4};
        int k = 1;
        System.out.println(minOperations(nums, k));
    }

    private static int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num: nums) {
            sum ^= num;
        }

        int diff = sum ^ k;
        return Integer.bitCount(diff);
    }
}
