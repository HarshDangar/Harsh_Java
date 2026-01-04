public class P1616 {

    //Problem is working but time limit exceed so have to write a new code
    public static void main(String[] args) {
        String a = "ulacfd", b = "jizalu";
        System.out.println(checkPalindromeFormation(a, b));
    }

    public static boolean checkPalindromeFormation(String a, String b) {

        for (int i = 0; i < a.length(); i++) {
            if (isPalindrome(a.substring(0, i) + b.substring(i, a.length())))
                return true;
            if (isPalindrome(b.substring(0, i) + a.substring(i, a.length())))
                return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
