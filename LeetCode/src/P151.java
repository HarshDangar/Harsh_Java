public class P151 {
    public static void main(String[] args) {
        String s = "  the sky  ";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }

    //Approach 1 : With using string split
    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }

    //Approach 2 : Without using in built methods
    private static String reverseWords2(String s) {
        StringBuilder res = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {
            //Skip the trailing spaces
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            //If i reached at out of bound than there is no string left so break
            if (i < 0)
                break;

            //We have reached at end
            int end = i;

            //Find the start of the word
            while (i >= 0 && s.charAt(i) != ' ')
                i--;

            //We have found the start but i is at index before the start
            int start = i + 1;

            //Here we have to include end char in the string so we have to increment in the substring method parameter
            String word = s.substring(start, end + 1);

            //If the result string is already having some string so we have to add space between the string
            if (!res.isEmpty())
                res.append(" ");

            res.append(word);
        }
        return res.toString();
    }
}
