import java.util.Arrays;
import java.util.HashMap;

public class P1897 {
    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words));
        System.out.println(makeEqual2(words));
        System.out.println(makeEqual3(words));
    }

    //Approach 1 : Using HashMap
    private static boolean makeEqual(String[] words) {
        int n = words.length;
        HashMap<Character, Integer> map = new HashMap<>();

        for (String word: words) {
            for(char ch: word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (int value: map.values()) {
            if (value % n != 0)
                return false;
        }
        return true;
    }

    //Approach 2 : Using array
    private static boolean makeEqual2(String[] words) {
        int n = words.length;
        int[] arr = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                arr[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] % n != 0) {
                return false;
            }
        }

        return true;
    }

    //Approach 3 : Using array stream
    private static boolean makeEqual3(String[] words) {
        int n = words.length;
        int[] arr = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                arr[ch - 'a']++;
            }
        }

        return Arrays.stream(arr).allMatch(c -> c % n == 0);
    }
}
