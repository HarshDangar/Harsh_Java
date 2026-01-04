public class P1832_2 {
    public static void main(String[] args) {
        String arr = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram((arr)));
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 97] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == false) {
                return false;
            }
        }
        return true;
    }
}