import java.util.Arrays;

public class P344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
