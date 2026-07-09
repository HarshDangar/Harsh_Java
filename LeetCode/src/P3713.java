public class P3713 {
    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(longestBalanced(s));
    }

    private static int longestBalanced(String s) {
        int n = s.length();
        int maxL = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                if (checkBalanced(freq))
                    maxL = Math.max(maxL, j - i + 1);
            }
        }
        return maxL;
    }

    private static boolean checkBalanced(int[] freq) {
        int temp = 0;

        for (int f: freq) {
            if (f == 0)
                continue;
            if (temp == 0)
                temp = f;
            else if (f != temp) {
                return false;
            }
        }
        return true;
    }
}
