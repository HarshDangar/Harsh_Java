import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P389 {
    public static void main(String[] args) {
        String s = "abd", t = "abcd";
        System.out.println(findTheDifference(s, t));
        System.out.println(findTheDifference2(s, t));
        System.out.println(findTheDifference3(s, t));
    }

    private static char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (sArray[i] != tArray[j]) {
                break;
            }
            i++;
            j++;
        }
        return tArray[j];
    }

    private static char findTheDifference2(String s, String t) {
        int xor = 0;

        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i) ^ t.charAt(i);
        }

        xor ^= t.charAt(t.length() - 1);
        return (char) xor;
    }

    //Approach 3 : Hashmap
    private static char findTheDifference3(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            if (mp.get(ch) < 0)
                return ch;
        }

        return 'a';
    }
}
