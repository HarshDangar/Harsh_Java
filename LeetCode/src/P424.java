public class P424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int ans = 0;

        int i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freq[c - 'A']++;

            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            while ((j - i + 1) - maxFreq > k) {
                char l = s.charAt(i);
                freq[l - 'A']--;
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
