
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P73 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int value : rowSet) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[value][i] = 0;
            }
        }

        for (int value : colSet) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][value] = 0;
            }
        }
    }
}
