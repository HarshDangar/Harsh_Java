public class P1680 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(concatenatedBinary(n));
    }

    private static int concatenatedBinary(int n) {
        final long modulo = (long) (1e9 + 7);
        long ans = 0;
        int bitCount = 1;
        int powerOfTwo = 2;

        for (int i = 1; i <= n; i++) {
            if (i == powerOfTwo) {
                bitCount++;
                powerOfTwo *= 2;
            }

            ans = ((ans << bitCount) + i) % modulo;
        }

        return (int) ans;
    }
}
