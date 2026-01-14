public class P342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(256));
    }

    public static boolean isPowerOfFour(int n) {
        int x ;
        if (n > 0) {
            x = (int) (Math.log10(n) / Math.log10(4));
            return (int) Math.pow(4, x) == n;
        } else
            return false;
    }
}
