import java.util.Arrays;

public class P1886 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        if (isSame(mat,target))
            return true;

        for (int i = 0; i < 3; i++) {
            // total we can rotate the array is 3 because in 4th turn it will be original array
            int[][] arr = new int[mat.length][mat[0].length];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat.length; col++) {
                    arr[row][col] = mat[mat.length - 1 - col][row];
                }
            }
            if (isSame(arr, target))
                return true;

            mat = arr;
        }
        return false;
    }

    private static boolean isSame(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
