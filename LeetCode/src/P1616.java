public class P1616 {
    public static void main(String[] args) {
        String a = "ulacfd", b = "jizalu";
        System.out.println(checkPalindromeFormation(a, b));
    }

    private static boolean checkPalindromeFormation(String a, String b) {
        return validate(a, b) || validate(b, a);
    }

    private static boolean validate(String a, String b) {
        int start = 0;
        int end = a.length() - 1;

        while (start < end) {
            if (a.charAt(start) != b.charAt(end))
                break;
            start++;
            end--;
        }
        return isPalindrome(a, start, end) || isPalindrome(b, start, end);
    }

    private static boolean isPalindrome(String a, int start, int end) {
        while (start < end) {
            if (a.charAt(start) != a.charAt(end))
                return false;
            start++;
            end--;
        }
        return start >= end;
    }
}
