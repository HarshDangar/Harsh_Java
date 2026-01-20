import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1200 {
    public static void main(String[] args) {
        int[] nums = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minimumAbsDifference(nums));
    }

    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDifference)
                minDifference = arr[i + 1] - arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDifference)
                list.add(new ArrayList<>(List.of(arr[i], arr[i + 1])));
        }

        return list;
    }
}
