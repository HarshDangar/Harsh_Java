import java.util.Arrays;

public class P1901 {
    public static void main(String[] args) {
        int[][] mat = {{1, 4}, {3, 2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
        System.out.println(Arrays.toString(findPeakGrid2(mat)));
    }

    //Brute Force
    private static int[] findPeakGrid(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                int left = col > 0 ? mat[row][col - 1] : -1;
                int right = col < mat[0].length - 1 ? mat[row][col + 1] : -1;
                int top = row > 0 ? mat[row - 1][col] : -1;
                int bottom = row < mat.length - 1 ? mat[row + 1][col] : -1;

                if (mat[row][col] > left && mat[row][col] > right && mat[row][col] > top && mat[row][col] > bottom) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Approach 2 :
    private static int[] findPeakGrid2(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start = 0;
        int end = rows - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int max = Integer.MIN_VALUE;
            int maxEleCol = -1;

            //Step 1 : find the max element in the row but we are starting from the middle of the rows
            //But to check the top and bottom of that element we need to store column of that element
            for (int i = 0; i < cols; i++) {
                if (mat[mid][i] > max) {
                    max = mat[mid][i];
                    maxEleCol = i;
                }
            }

            //Now we have the max element in the mid row, next we have to check the top and bottom of the element
            int top = mid > 0 ? mat[mid - 1][maxEleCol] : -1;
            int bottom = mid < mat.length - 1 ? mat[mid + 1][maxEleCol] : -1;

            if (top < max && max > bottom) {
                //Ans found
                return new int[]{mid, maxEleCol};
            } else if (top < max && bottom > max) {
                //Move down
                start = mid + 1;
            } else {
                //Move up
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
