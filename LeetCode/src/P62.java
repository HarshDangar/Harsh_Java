import java.util.Arrays;

public class P62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 5));
        System.out.println(uniquePaths2(3, 5));
        System.out.println(uniquePaths3(3, 5));
    }

    //Bottom up with going from goal position to starting
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

    //Recurstion + Memoization
    static int[][] dp;
    private static int uniquePaths2(int m, int n) {
        dp = new int[m][n];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, m, n);
    }

    private static int solve(int i, int j, int m, int n) {
        if(i == m - 1 && j == n - 1)
            return 1;

        //Out of bound
        if(i < 0 || i >= m || j < 0 || j >= n)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        int right = solve(i, j + 1, m, n);
        int down = solve(i + 1, j, m , n);

        return dp[i][j] = right + down;
    }

    //Bottom up with starting position to goal
    private static int uniquePaths3(int m, int n) {
        int[][] t = new int[m][n];

        //There is only one way to go right
        for(int i  = 0; i < n; i++) {
            t[0][i] = 1;
        }

        //There is only one way to down
        for(int j  = 0; j < m; j++) {
            t[j][0] = 1;
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                //At any position total ways will be ways to reach left + ways to reach up position
                t[i][j] = t[i][j - 1] + t[i - 1][j];
            }
        }

        return t[m - 1][n - 1];
    }
}
