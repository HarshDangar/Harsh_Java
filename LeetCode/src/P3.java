import java.util.HashMap;
import java.util.HashSet;

public class P3 {
    public static void main(String[] args) {
        String s = "abccbabb";
        System.out.println(lengthOfLongestSubstring2(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int maxCount = 0;

        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                i = map.get(s.charAt(i)) + 1;
                map.clear();
                count = 0;
            } else {
                map.put(s.charAt(i), i);
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
                i++;
            }
        }
        return maxCount;
    }

    private static int lengthOfLongestSubstring2(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
