public class P1688 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }

    private static int numberOfMatches(int n) {
        int result = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                result += n / 2;
                n = n / 2;
            } else {
                result += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return result;
    }
}
