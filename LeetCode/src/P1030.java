import java.util.Arrays;

public class P1030 {
    public static void main(String[] args) {
        int rows = 2, cols = 3, rCenter = 1, cCenter = 2;
        System.out.println(Arrays.deepToString(allCellsDistOrder(rows, cols, rCenter, cCenter)));
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][];
        result[0] = new int[] {rCenter, cCenter};

        int index = 1;
        int maxDistance = Math.max(rCenter, rows-rCenter-1) + Math.max(cCenter, cols-cCenter-1);

        for (int distance = 1; distance <= maxDistance; distance++) {
            //Current row will be top position on diamond shape
            int currentRow = rCenter - distance;
            int currentCol = cCenter;

            //Traversing from top to left
            for (int count = distance; count > 0; count--) {
                if (currentRow >= 0 && currentCol >= 0) {
                    result[index++] = new int[] {currentRow, currentCol};
                }
                currentRow++;
                currentCol--;
            }

            //Left to bottom
            for (int count = distance; count > 0; count--) {
                if (currentRow < rows && currentCol >= 0) {
                    result[index++] = new int[] {currentRow, currentCol};
                }
                currentRow++;
                currentCol++;
            }

            //Bottom to right
            for (int count = distance; count > 0; count--) {
                if (currentRow < rows && currentCol < cols) {
                    result[index++] = new int[] {currentRow, currentCol};
                }
                currentRow--;
                currentCol++;
            }

            //Right to top
            for (int count = distance; count > 0; count--) {
                if (currentRow >= 0 && currentCol < cols) {
                    result[index++] = new int[] {currentRow, currentCol};
                }
                currentRow--;
                currentCol--;
            }
        }
        return result;
    }
}
