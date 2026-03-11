
public class P1634 {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[26];
        int count = 0;

        for (char c: allowed.toCharArray()) {
            map[c - 'a'] = true;
        }

        for (String string: words) {
            boolean flag = true;
            for (char c: string.toCharArray()) {
                if (!map[c - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
}
