import java.util.HashMap;

public class P1217 {
    public static void main(String[] args) {
        int[] arr = {1, 1000000000};
        System.out.println(minCostToMoveChips(arr));
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int chip : position) {
            if (chip % 2 == 0)
                even++;
        }
        return Math.min(even, position.length - even);
    }
}
