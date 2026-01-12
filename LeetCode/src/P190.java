public class P190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(2147483644));
    }

    public static int reverseBits(int n) {
        int sum = 0;

        for (int i = 31; i >= 0; i--) {
            sum += (int) (Math.pow(2,i) * (n & 1));
            n = n >> 1;
        }

        return sum;
    }
}
