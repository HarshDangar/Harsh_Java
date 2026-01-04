
public class P414 {
    public static void main(String[] args) {
        int[] nums = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long fMax = Long.MIN_VALUE;
        long sMax = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;

        for (int num: nums) {
            if (num > max) {
                fMax = sMax;
                sMax = max;
                max = num;
            } else if (num < max && num > sMax) {
                fMax = sMax;
                sMax = num;
            } else if (num > fMax && num < sMax) {
                fMax = num;
            }
        }
        return fMax != Long.MIN_VALUE ? (int) fMax : (int) max;
    }
}
