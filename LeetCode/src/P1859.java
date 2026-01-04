public class P1859 {
    public static void main(String[] args) {
        String name = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(name));
    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");

        String[] ansArray = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            int temp = Character.getNumericValue(words[i].charAt(words[i].length() - 1));
            ansArray[temp - 1] = words[i].substring(0, words[i].length() - 1);
        }


        for (int i = 0; i < ansArray.length; i++) {
            sb.append(ansArray[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
