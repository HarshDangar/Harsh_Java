import java.util.HashMap;

public class P383 {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c: ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }

    private static boolean canConstruct2(String ransomNote, String magazine) {
        int[] magArray = new int[26];

        for (char c: magazine.toCharArray()) {
            magArray[c - 'a']++;
        }

        for (char c: ransomNote.toCharArray()) {
            if (magArray[c - 'a'] <= 0)
                return false;

            magArray[c - 'a']--;
        }
        return true;
    }
}
