import java.util.HashSet;

public class P409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                ans += 2;
            } else {
                set.add(ch);
            }
        }

        if (!set.isEmpty())
            ans++;
        return ans;
    }
}
