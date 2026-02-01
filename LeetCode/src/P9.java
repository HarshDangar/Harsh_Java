public class P9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        int reverse = 0;
        int n = x;

        if (n < 0)
            return false;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        return reverse == x;
    }
}
