import java.util.ArrayList;
import java.util.Arrays;

public class P345 {
    public static void main(String[] args) {
        String  s = "IceCreAm";
        System.out.println(reverseVowels2(s));
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

    private static String reverseVowels2(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (!isCharVowel(arr[i]))
                i++;
            else if (!isCharVowel(arr[j]))
                j--;
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }

    private static boolean isCharVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
}
