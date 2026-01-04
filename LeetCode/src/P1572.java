public class P1572 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                    sum += mat[i][mat.length - 1 - i];
                }
            }
        }

        if (mat.length % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }

        return sum;
    }
}
