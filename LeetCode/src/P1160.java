public class P1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println(countCharacters(words, chars));
    }

    private static int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];

        for(char ch : chars.toCharArray()) {
            charCount[ch - 'a']++;
        }

        int ans = 0;

        for (String word : words) {
            int[] wordCount = new int[26];
            for (char ch : word.toCharArray()) {
                wordCount[ch - 'a']++;
            }

            boolean check = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    check = false;
                    break;
                }
            }

            if (check)
                ans += word.length();
        }

        return ans;
    }
}
