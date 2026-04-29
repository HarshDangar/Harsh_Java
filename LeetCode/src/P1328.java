public class P1328 {
    public static void main(String[] args) {
        String palindrome = "aa";
        System.out.println(breakPalindrome(palindrome));
    }

    private static String breakPalindrome(String palindrome) {
        char[] arr = palindrome.toCharArray();
        int n = palindrome.length();

        if (n == 1)
            return "";

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n - 1] = 'b';
        return String.valueOf(arr);
    }
}
