import java.util.ArrayList;
import java.util.List;

public class CountOccurAnagram {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr", pat = "for";
        System.out.println(search(pat, txt));
        System.out.println(findAnagrams(txt, pat));
    }

    private static int search(String pat, String txt) {
        int k = pat.length();
        int[] count = new int[26];

        for (char ch: pat.toCharArray()) {
            count[ch - 'a']++;
        }

        int i = 0, j = 0;
        int n = txt.length();
        int result = 0;

        while (j < n) {
            count[txt.charAt(j) - 'a']--;

            if (j - i + 1 == k) {
                if (allZero(count))
                    result++;

                count[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return result;
    }

    private static boolean allZero(int[] count) {
        for (int num: count) {
            if (num != 0)
                return false;
        }
        return true;
    }

    //Find all anagrams
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
}
