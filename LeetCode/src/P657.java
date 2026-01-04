public class P657 {
    public static void main(String[] args) {
        String moves = "UDLL";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int row = 0, col = 0;

        if (moves.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < moves.length(); i++) {
                switch (moves.charAt(i)) {
                    case 'U':
                        col--;
                        break;
                    case 'D':
                        col++;
                        break;
                    case 'L':
                        row--;
                        break;
                    case 'R':
                        row++;
                        break;
                }
            }
        }

        return row == 0 && col == 0;
    }
}
