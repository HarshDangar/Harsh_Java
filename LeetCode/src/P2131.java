import java.util.HashMap;

public class P2131 {
    public static void main(String[] args) {
        String[] words = {"mm","mm","yb","by","bb","bm","ym","mb","yb","by","mb","mb","bb","yb","by","bb","yb","my","mb","ym"};
        System.out.println(longestPalindrome(words));
    }

    private static int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        boolean centerUsed = false;
        int result = 0;

        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            String rev = sb.reverse().toString();

            if (!rev.equals(word)) { //"ab" "ba"    ->.  {ab      ba}
                if (map.get(word) > 0 && map.containsKey(rev) && map.get(rev) > 0) {
                    map.put(word, map.get(word) - 1);
                    map.put(rev, map.get(rev) - 1);
                    result += 4;
                }
            } else { //"abcc      ccba"
                if (map.get(word) >= 2) {
                    //We can use both ways in palindrome string
                    map.put(word, map.get(word) - 2);
                    result += 4;
                } else if (map.get(word) == 1 && !centerUsed){ //If center is empty than we can use the string for that position
                    map.put(word, map.get(word) - 1);
                    result += 2;
                    centerUsed = true; //Now onwards we can't use the center position string
                }
            }
        }
        return result;
    }

    //Approach 2
    private static int longestPalindrome2(String[] words) {
        int[][] mpp = new int[26][26];
        int count = 0, middle = 0;
        for (String s : words) {
            int x = s.charAt(0) - 'a', y = s.charAt(1) - 'a';
            if (mpp[y][x] > 0) {
                mpp[y][x]--;
                count += 4;
                if (x == y) middle--;
            } else {
                mpp[x][y]++;
                if (x == y) middle++;
            }
        }
        if (middle > 0) count += 2;
        return count;
    }
}
