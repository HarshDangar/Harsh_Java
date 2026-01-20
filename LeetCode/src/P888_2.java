import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P888_2 {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int candy : aliceSizes) aliceTotal += candy;
        for (int candy : bobSizes) bobTotal += candy;

        Set<Integer> targets = new HashSet<>();
        for (int i = 0; i < aliceSizes.length; i++) {
            targets.add((bobTotal - aliceTotal + 2 * aliceSizes[i]) / 2);

            for (int j = 0; j < bobSizes.length; j++) {
                if (targets.contains(bobSizes[j])) {
                    return new int[]{(aliceTotal - bobTotal + 2 * bobSizes[j]) / 2, bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}
