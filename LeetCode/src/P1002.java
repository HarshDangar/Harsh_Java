import java.util.ArrayList;
import java.util.List;

public class P1002 {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }

    private static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        int[] freq = new int[26];
        fillTheArray(words[0], freq);

        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];
            fillTheArray(words[i], temp);

            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], temp[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                //We have to add the element for the ans time
                for (int j = 0; j < freq[i]; j++) {
                    list.add(String.valueOf((char) (i + 'a')));
                }
            }
        }
        return list;
    }

    private static void fillTheArray(String word, int[] freq) {
        for (char ch: word.toCharArray()) {
            freq[ch - 'a']++;
        }
    }
}
