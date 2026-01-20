public class P1252 {
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2, 3, indices));
    }

    private static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int count = 0;

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            //Row increment
            for (int j = 0; j < n; j++) {
                arr[row][j]++;
            }

            //Col increment
            for (int j = 0; j < m; j++) {
                arr[j][col]++;
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
}
