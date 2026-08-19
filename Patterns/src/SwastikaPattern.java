public class SwastikaPattern {
    public static void main(String[] args) {
        int n = 20;
        print(n);
    }

    private static void print(int n) {

        for (int row = 0; row < n; row++) {
            if (row == 0) {
                System.out.print("*");
                
                //Space
                for (int i = 1; i < n / 2; i++) {
                    System.out.print(" ");
                }

                for (int i = n / 2; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (row < n / 2) {
                System.out.print("*");

                //Space
                for (int i = 1; i < n / 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            } else if (row == n / 2) {
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (row > n / 2 && row < n - 1) {
                //space
                for (int i = 0; i < n / 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int i = n / 2 + 1; i < n - 1; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            } else {
                for (int i = 0; i < n / 2; i++) {
                    System.out.print("*");
                }
                System.out.print("*");

                //Space
                for (int i = n / 2 + 1; i < n - 1; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
