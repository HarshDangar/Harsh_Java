public class P1536 {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1}, {1, 1, 0}, {1, 0, 0}};
        System.out.println(minSwaps(grid));
    }

    private static int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeroCount = new int[n];
        // First step trailing zeros count

        for (int row = 0; row < n; row++) {
            int count = 0;
            /* We have to start the check from end because of the diagonal
                if checked element is not zero than we break
             */

            for (int col = n - 1; col >= 0; col--) {
                if (grid[row][col] != 0)
                    break;
                count++;
            }
            zeroCount[row] = count;
        }

        /* Next step to check if row has required trailing zeros if not than
            find the row that have required trailing zeros and swap that row
            if no row have required trailing zeros than return -1
         */
        int required = n - 1; // because first row will required columns - 1 zeros
        int count = 0;
        while (required > 0) {
            boolean flag = false;

            for (int i = n - required - 1; i < n; i++) {
                if (zeroCount[i] >= required) {
                    // Found the row so now we have to swap the rows
                    int temp = zeroCount[i];
                    for (int j = i; j > n - required - 1; j--) {
                        /* here j = i meaning the row which is found with required trailing zeros
                            n - required - 1 == row which need to replace with required traling zeros
                         */
                        zeroCount[j] = zeroCount[j - 1];
                    }
                    zeroCount[n - required - 1] = temp;

                    /* But here we have not done anything for if no row have required trailing zeros
                        than the answer should be -1
                        for that we can take boolean flag to remember is swap happens or not
                     */
                    flag = true; // Mean swap happen

                    count += i - (n - required - 1);
                    break;
                }
            }

            if (!flag) { // flag == false (no swap)
                return -1;
            }
            required--;
        }
        return count;
    }

    private static int minSwaps2(int[][] grid) {
        int n = grid.length;
        int[] endZeros = new int[n];

        for (int row = 0; row < n; row++) {
            int count = 0;
            for (int col = n - 1; col >= 0; col--) {
                if (grid[row][col] != 0)
                    break;
                count++;
            }
            endZeros[row] = count;
        }

        int steps = 0;

        for (int i = 0; i < n; i++) {
            int need = n - i - 1;
            int j = i;
            while (j < n && endZeros[j] < need) {
                j++;
            }
            if (j == n)
                //No row found
                return -1;
            steps += j - i;
            while (j > i) {
                endZeros[j] = endZeros[j - 1];
                j--;
            }
        }
        return steps;
    }
}
