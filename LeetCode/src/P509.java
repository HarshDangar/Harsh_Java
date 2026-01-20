public class P509 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    private static int fib(int n) {
        if (n <= 1) return n;

        int prev1 = 1;
        int prev2 = 0;
        int cur = 0;

        for (int i = 2; i <= n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }
}
