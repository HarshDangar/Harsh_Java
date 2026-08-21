import java.util.Arrays;
import java.util.HashMap;

public class P1624 {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
        System.out.println(maxLengthBetweenEqualCharacters2(s));
        System.out.println(maxLengthBetweenEqualCharacters3(s));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = Math.max(result, j - i - 1);
                }
            }
        }

        return result;
    }

    private static int maxLengthBetweenEqualCharacters2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                ans = Math.max(ans, i - map.get(ch) - 1); // i - j - 1
            } else {
                map.put(ch, i);
            }
        }
        return ans;
    }

    private static int maxLengthBetweenEqualCharacters3(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            } else {
                result = Math.max(result, i - arr[ch - 'a'] - 1); //i - j - 1
            }
        }

        return result;
    }
}
