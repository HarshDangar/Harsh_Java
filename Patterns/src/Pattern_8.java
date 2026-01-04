public class Pattern_8 {
    public static void main(String[] args) {
        int row = 5;
        int col = (row * 2) - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 9 - (col - row - i) * 2; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < col - row - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
