import java.util.Arrays;

public class P888 {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int candy : aliceSizes) {
            aliceTotal += candy;
        }
        for (int candy : bobSizes) {
            bobTotal += candy;
        }

        for (int aliceSize : aliceSizes) {
            for (int bobSize : bobSizes) {
                if (aliceTotal - aliceSize + bobSize == bobTotal + aliceSize - bobSize) {
                    return new int[]{aliceSize, bobSize};
                }
            }
        }
        return new int[]{0, 0};
    }
}
