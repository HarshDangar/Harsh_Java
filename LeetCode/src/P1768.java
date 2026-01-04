public class P1768 {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }

        if (word1.length() > word2.length()) {
            sb.append(word1, i, word1.length());
        }

        if (word1.length() < word2.length()) {
            sb.append(word2, i, word2.length());
        }

        return sb.toString();
    }
}
