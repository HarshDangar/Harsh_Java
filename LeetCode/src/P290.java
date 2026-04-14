import java.util.HashMap;

public class P290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length)
            return false;

        for (int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr[i]))
                    return false;
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}
