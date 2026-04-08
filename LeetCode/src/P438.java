import java.util.ArrayList;
import java.util.List;

public class P438 {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int k = p.length();
        int[] count = new int[26];

        for (char ch: p.toCharArray()) {
            count[ch - 'a']++;
        }

        int i = 0, j = 0;
        int n = s.length();

        while (j < n) {
            count[s.charAt(j) - 'a']--;

            if (j - i + 1 == k) {
                if (allZero(count))
                    ans.add(i);

                count[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }

    private static boolean allZero(int[] count) {
        for (int num: count) {
            if (num != 0)
                return false;
        }
        return true;
    }
}
