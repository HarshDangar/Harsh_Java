public class Pattern_0 {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            //Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Starting part
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //Reverse part
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
