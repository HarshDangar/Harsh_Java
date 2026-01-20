import java.util.Arrays;

public class P436 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {0, 1}, {3, 4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    private static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            ans[i] = search(intervals[i][1], intervals);
        }
        return ans;
    }

    private static int search(int num, int[][] intervals) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < intervals.length; j++) {
            if (intervals[j][0] >= num && intervals[j][0] < min) {
                ans = j;
                min = intervals[j][0];
            }
        }
        return ans;
    }

}
