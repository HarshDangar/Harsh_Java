public class P374 {
    public static int guessNumber(int n) {
        long start = 1;
        long end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (guess((int) mid) == 1) {
                start = mid + 1;
            } else if (guess((int) mid) == -1) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return -2;
    }

    public static int guess(int num) {
        int pick = 8;

        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
