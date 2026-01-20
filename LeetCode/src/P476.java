public class P476 {
    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }

    private static int findComplement(int num) {
        int count = 0;
        int sum = 0;

        while (num != 0) {
            sum += (int) (((num & 1) ^ 1) * Math.pow(2, count));
            count++;
            num >>= 1;
        }

        return sum;
    }
}
