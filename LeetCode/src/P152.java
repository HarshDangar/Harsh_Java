public class P152 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, -1};
        System.out.println(maxProduct(nums));
    }

    //Kaden's Algorithm
    private static int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int prod = 1;

        for (int num : nums) {
            prod *= num;
            maxProd = Math.max(maxProd, prod);

            if (prod == 0) //Meaning if we can not collaborate than start from your money
                prod = 1;
        }
        prod = 1;

        for (int j = nums.length - 1; j >= 0; j--) {
            prod *= nums[j];
            maxProd = Math.max(maxProd, prod);

            if (prod == 0)
                prod = 1;
        }
        return maxProd;
    }
}
