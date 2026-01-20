import java.util.Arrays;

public class P566 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int total = mat.length * mat[0].length;
        if (total != r * c)
            return mat;

        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                ans[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return ans;
    }
}
