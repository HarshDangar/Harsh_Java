import java.util.ArrayList;
import java.util.List;

public class P1380 {
    public static void main(String[] args) {
        int[][] arr = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] arr : matrix) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < matrix[0].length; j++) {
                if (arr[j] < min) {
                    minIndex = j;
                    min = arr[j];
                }
            }

            for (int[] value : matrix) {
                if (value[minIndex] > max) {
                    max = value[minIndex];
                }
            }

            if (max == min) {
                list.add(max);
            }
        }

        return list;
    }
}
