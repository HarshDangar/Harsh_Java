public class P2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    private static String reversePrefix(String word, char ch) {
        StringBuilder finalAns = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int index;

        if (word.contains(String.valueOf(ch))) {
            index = word.indexOf(String.valueOf(ch));
            temp.append(word.substring(0, index + 1));
            finalAns.append(temp.reverse().toString()).append(word.substring(index + 1));
        } else {
            finalAns.append(word);
        }

        return finalAns.toString();
    }
}
