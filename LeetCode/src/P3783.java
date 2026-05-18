public class P3783 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(mirrorDistance(n));
    }

    private static int mirrorDistance(int n) {
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return Math.abs(n - rev);
    }
}
