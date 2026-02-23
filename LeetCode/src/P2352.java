import java.util.Arrays;

public class P2352 {
    public static void main(String[] args) {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(equalPairs2(grid));
    }

    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int k;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        break;
                    }
                }
                if (k != n)
                    continue; // Here if k is not checked completely meaning we have to skip the column otherwise the count is plushed
                count++;
            }
        }
        return count;
    }

    public static int equalPairs2(int[][] grid) {
        int count = 0;
        int n = grid.length;

        /* If we save the column and compare with the rows than we can save time
                for that we have to build the column array so that we can compare row and col array directly
         */

        for (int col = 0; col < n; col++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = grid[i][col];
            }

            //Now we have the particular column saved in array now we can compare it with the rows

            for (int[] row: grid) {
                if (Arrays.equals(row, column))
                    count++;
            }
        }
        return count;
    }
}
