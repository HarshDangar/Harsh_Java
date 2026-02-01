public class P7 {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        long ans = 0;
        int temp = Math.abs(x);

        while (temp > 0) {
            ans += temp % 10;
            ans *= 10;
            temp /= 10;
        }

        ans /= 10;

        if (ans >= Integer.MAX_VALUE)
            return 0;
        else if (x < 0)
            return (int) (ans *= -1);

        return (int) ans;
    }
}
