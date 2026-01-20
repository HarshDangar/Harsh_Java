public class P1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    private static int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = 1;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            mult *= rem;
            n /= 10;
        }
        return mult - sum;
    }
}


