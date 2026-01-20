public class P37 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    private static boolean solve(char[][] board) {
        int row = -1;
        int col = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    for (char k = '1'; k <= '9'; k++) {
                        if (isSafe(board, row, col, k)) {
                            board[row][col] = k;
                            if (solve(board)) {
                                return true;
                            }
                            board[i][j] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(char[][] board) {
        for (char[] row : board) {
            for (char character : row) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, char character) {

        for (int i = 0; i < board.length; i++) {
            //Check the row
            // Check the number is in the row or not
            if (board[row][i] == character) {
                return false;
            }

            //Check the col
            if (board[i][col] == character) {
                return false;
            }
        }

        //Square matrix
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == character) {
                    return false;
                }
            }
        }
        return true;
    }
}
