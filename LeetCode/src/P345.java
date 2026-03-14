import java.util.ArrayList;
import java.util.Arrays;

public class P345 {
    public static void main(String[] args) {
        String  s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int start = 0, end = s.length() - 1;
        char[] ch = s.toCharArray();

        while (start < end) {
            //First find vowel from start
            while (start < end && !vowels.contains(s.charAt(start))) {
                start++;
            }

            //We have find the start vowel so we have to find index of related vowel from end
            while (start < end && !vowels.contains(s.charAt(end))) {
                end--;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;

        }
        return String.valueOf(ch);
    }
}
