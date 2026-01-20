public class P1662 {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            ans1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            ans2.append(word2[i]);
        }

        return ans1.toString().equals(ans2.toString());
    }
}
