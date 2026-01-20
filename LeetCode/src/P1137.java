public class P1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    private static int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;
        int cur = 0;

        for (int i = 3; i <= n; i++) {
            cur = a + b + c;
            a = b;
            b = c;
            c = cur;
        }

        return cur;
    }
}
