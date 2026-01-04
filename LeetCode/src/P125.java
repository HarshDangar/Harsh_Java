import java.util.Objects;

public class P125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome3(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;

        while (start <= end) {
            if (alphanumeric(s.charAt(start)) == false) {
                start++;
            } else if (alphanumeric(s.charAt(end)) == false) {
                end--;
            } else {
                if (s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean alphanumeric(char character) {
        if (character >= 'a' && character <= 'z' || character >= '0' && character <= '9') {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }

    public static boolean isPalindrome3(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-z0-9]", ""));
        return Objects.equals(sb.toString(), sb.reverse().toString());
    }
}
