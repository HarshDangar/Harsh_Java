public class P136 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] nums) {
        int sum = 0;
        for (int value : nums) {
            sum ^= value;
        }
        return sum;
    }
}
