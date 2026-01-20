public class P441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    private static int arrangeCoins(int n) {
        long start = 1, end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * (mid + 1) / 2 == n) {
                return (int) mid;
            } else if (mid * (mid + 1) / 2 < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
