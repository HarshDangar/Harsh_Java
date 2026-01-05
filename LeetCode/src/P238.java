import java.util.Arrays;

public class P238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int zeroIndex = -1;
        int product = 1;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }
            else {
                product *= nums[i];
            }
        }

        int [] result = new int [nums.length];

        if(zeroCount == 0) {
            for(int i = 0 ; i < nums.length ; i++) {
                result[i] = product / nums[i];
            }
        }
        else if(zeroCount == 1) {
            result[zeroIndex] = product;
        }
        return result;
    }
}
