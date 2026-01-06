import java.util.Arrays;
import java.util.HashMap;

public class P1331 {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] duplicate = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        int rank = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < duplicate.length; i++) {
            ans[i] = map.get(duplicate[i]);
        }

        return ans;
    }
}
