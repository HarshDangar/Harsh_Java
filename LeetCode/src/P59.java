import java.util.Arrays;

public class P59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(5)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 0;

        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // right traverse
            for (int i = colBegin; i <= colEnd; i++) {
                arr[rowBegin][i] = ++count;
            }
            rowBegin++;

            // down traverse
            for (int i = rowBegin; i <= rowEnd; i++) {
                arr[i][colEnd] = ++count;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // left traverse
                for (int i = colEnd; i >= colBegin; i--) {
                    arr[rowEnd][i] = ++count;
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // up traverse
                for (int i = rowEnd; i >= rowBegin; i--) {
                    arr[i][colBegin] = ++count;
                }
            }
            colBegin++;
        }
        return arr;
    }
}
