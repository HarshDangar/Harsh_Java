public class P5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    //Approach 1 : Basic check every substring
    private static String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkPalindrome(s, i, j)) {
                    if (j - i + 1 > maxLen) {
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    private static String longestPalindrome2(String s) {
        return solve(s, 0, s.length() - 1);
    }

    private static String solve(String s, int i, int j) {
        if (j - i + 1 == 1)
            return String.valueOf(s.charAt(i));

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                solve(s, i + 1, j);
                solve(s, i, j - 1);
            } else {
                if (checkPalindrome(s, i, j))
                    return null;

            }
        }
        return null;
    }

    private static boolean checkPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
