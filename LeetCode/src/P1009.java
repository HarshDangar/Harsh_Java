public class P1009 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement2(5));
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

    /*Important pattern: If we want the bit count of any number in binary representation than if we do
            (log(n) / log(2)) + 1 than it gives the count
            One more trick if we want to make mask like 111111... than it can be made with
            (1 << bitCount) - 1 == 2 ^ bitCount - 1
     */
    private static int bitwiseComplement2(int n) {
        if (n == 0)
            return 1;

        int bitCount = (int) (Math.log(n) / Math.log(2)) + 1;
        int mask = (1 << bitCount) - 1;
        return n ^ mask;
    }
}
