public class P2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
        System.out.println(reversePrefix2(word, ch));
    }

    private static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index != -1)
            return new StringBuilder(word.substring(0, index + 1)).reverse() + word.substring(index + 1);

        return word;
    }

    private static String reversePrefix2(String word, char ch) {
        int i = 0;
        int j = word.indexOf(ch);

        char[] arr = word.toCharArray();
        while (i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        return new String(arr);
    }
}
