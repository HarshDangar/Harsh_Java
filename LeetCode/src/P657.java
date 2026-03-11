public class P657 {
    public static void main(String[] args) {
        String moves = "UDLL";
        System.out.println(judgeCircle(moves));
    }

    private static boolean judgeCircle(String moves) {
        int row = 0, col = 0;

        for (char c: moves.toCharArray()) {
            switch (c) {
                case 'U' -> col--;
                case 'D'-> col++;
                case 'L'-> row--;
                case 'R'-> row++;
            }
        }

        return row == 0 && col == 0;
    }
}
