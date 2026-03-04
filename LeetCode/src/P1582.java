public class P1582 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        System.out.println(numSpecial(mat));
    }

    private static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int special = 0;

        for (int i = 0; i < m; i++) {
            int count = 0;
            int col = -1;

            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                    col = j;
                }
            }

            if (count != 1) {
                continue; //Row skip
            } else if (checkCol(mat, i, col)) {
                special++;
            }
        }
        return special;
    }

    private static boolean checkCol(int[][] mat, int row, int col) {
        for (int i = 0; i < mat.length; i++) {
            if (i != row) {
                if (mat[i][col] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
