import java.util.ArrayList;
import java.util.List;

public class P1380 {
    public static void main(String[] args) {
        int[][] arr = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    minIndex = j;
                    min = matrix[i][j];
                }
            }

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > max) {
                    max = matrix[k][minIndex];
                }
            }

            if (max == min) {
                list.add(max);
            }
        }

        return list;
    }
}
