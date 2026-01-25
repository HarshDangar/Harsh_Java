public class P62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 5));
    }

    private static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[m - 1][j] = 1;
        }

        for (int row = m - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                arr[row][col] = arr[row + 1][col] + arr[row][col + 1];
            }
        }

        return arr[0][0];
    }
}
