import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P54 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix.length == 0)
            return list;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // right traverse
            for (int i = colBegin; i <= colEnd; i++) {
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            // down traverse
            for (int i = rowBegin; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // left traverse
                for (int i = colEnd; i >= colBegin; i--) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // up traverse
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }

        return list;
    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;
        int m = matrix.length, n = matrix[0].length;
        int rowBegin = 0,  rowEnd = m - 1;
        int colBegin = 0, colEnd = n - 1;
        while (res.size() < m * n) {
            for (int j = colBegin; j <= colEnd && res.size() < m * n; j++)
                res.add(matrix[rowBegin][j]);

            for (int i = rowBegin + 1; i <= rowEnd - 1 && res.size() < m * n; i++)
                res.add(matrix[i][colEnd]);

            for (int j = colEnd; j >= colBegin && res.size() < m * n; j--)
                res.add(matrix[rowEnd][j]);

            for (int i = rowEnd - 1; i >= rowBegin + 1 && res.size() < m * n; i--)
                res.add(matrix[i][colBegin]);

            colBegin++; colEnd--; rowBegin++; rowEnd--;
        }
        return res;
    }
}
