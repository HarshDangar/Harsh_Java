public class P50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }

    private static double myPow(double x, int n) {
        return helper(x, n);
    }

    private static double helper(double x, long n) {
        if (n == 0)
            return 1;

        if (n < 0)
            return helper(1 / x, -n);

        if (n % 2 == 0) //x^n if n is even than we can write like this x ^ 8 == (x ^ 2) ^ 4 == (x * x) ^ n/2
            return helper(x * x, n / 2);

        return x * helper(x * x, (n - 1) / 2);
    }
}
