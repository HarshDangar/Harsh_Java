public class P1009 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }

    private static int bitwiseComplement(int n) {
        int count = 0;
        int sum = 0;

        if (n == 0)
            return 1;

        while (n != 0) {
            sum += (int) (((n & 1) ^ 1) * Math.pow(2, count));
            count++;
            n >>= 1;
        }

        return sum;
    }
}
