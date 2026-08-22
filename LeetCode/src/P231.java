public class P231 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        return Integer.bitCount(n) == 1;
    }
}
