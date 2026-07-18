import java.util.Arrays;
import java.util.HashMap;

public class P205 {
    public static void main(String[] args) {
        String s = "badc", t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if ((map.containsKey(ch1) && map.get(ch1) != ch2) ||
                    (!map.containsKey(ch1) && map.containsValue(ch2))) {
                return false;
            }
            map.put(ch1, ch2);
        }
        return true;
    }

    private static boolean isIsomorphic2(String s, String t) {
        int[] sArr = new int[256];
        int[] tArr = new int[256];
        Arrays.fill(sArr, -1);
        Arrays.fill(tArr, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (sArr[ch1] == -1 && tArr[ch2] == -1) {
                sArr[ch1] = ch2;
                tArr[ch2] = ch1;
            } else if (sArr[ch1] != ch2 || tArr[ch2] != ch1) {
                return false;
            }
        }
        return true;
    }
}
