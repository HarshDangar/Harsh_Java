public class P1967_2 {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    private static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                counter++;
            }
        }
        return counter;
    }
}
