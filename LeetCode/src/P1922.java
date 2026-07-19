public class P1922 {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }

    static final int M = (int)1e9 + 7;
    private static int countGoodNumbers(long n) {
        long evenIndices = (n + 1) / 2;
        long oddIndices = n / 2;

        long ans = (myPow(5, evenIndices) * myPow(4, oddIndices)) % M;

        return (int) ans;
     }

    private static long myPow(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = myPow(x, n / 2);
        long result = (half * half) % M;

        if (n % 2 == 1) {
            result = (result * x) % M;
        }

        return result;
    }
}
