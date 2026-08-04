import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start > result.getLast()[1]) {
                result.add(intervals[i]);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], end);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
