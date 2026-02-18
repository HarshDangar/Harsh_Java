import java.util.ArrayList;
import java.util.List;

public class P1431 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(arr, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        ArrayList<Boolean> list = new ArrayList<Boolean>(candies.length);

        for (int j : candies) {
            if (j > max) {
                max = j;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
