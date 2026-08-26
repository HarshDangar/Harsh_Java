import java.util.Arrays;

public class P2373 {
    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        System.out.println(Arrays.deepToString(largestLocal(grid)));
    }

    private static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                ans[i][j] = getMax(grid, i, j);
            }
        }
        return ans;
    }

    private static int getMax(int[][] grid, int row, int col) {
        int max = Integer.MIN_VALUE;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
