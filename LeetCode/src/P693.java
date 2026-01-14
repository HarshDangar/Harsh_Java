public class P693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(7));
    }

    public static boolean hasAlternatingBits(int n) {
        int lastBit = n & 1;
        n >>= 1;

        while (n != 0) {
            if ((n & 1) == lastBit)
                return false;
            else {
                lastBit = n & 1;
                n >>= 1;
            }
        }
        return true;
    }
}
