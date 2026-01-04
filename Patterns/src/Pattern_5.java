public class Pattern_5 {
    public static void main(String[] args) {
        int row = 9;
        for (int i = 0; i < row; i++) {
            if (i <= row / 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < row - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
