public class P1456 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }

        int ans = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k)))
                count--;

            if (isVowel(s.charAt(i)))
                count++;

            ans = Integer.max(ans, count);
        }
        return ans;
    }

    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
