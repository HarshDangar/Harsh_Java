public class P1351 {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(grid));
    }

    private static int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length - 1;
        int count = 0;
        int totalRow = grid.length;

        while (row < totalRow && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count = count + (totalRow - row);
                col--;
            }
        }
        return count;
    }
}
