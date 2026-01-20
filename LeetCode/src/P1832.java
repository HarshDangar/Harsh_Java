import java.util.Arrays;

public class P1832 {
    public static void main(String[] args) {
        String arr = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram2(arr));
    }


    private static boolean checkIfPangram2(String sentence) {
        char[] arr = sentence.toCharArray();
        Arrays.sort(arr);

        if (arr.length < 26) {
            return false;
        }

        return check(arr, 'a', 0);
    }

    private static boolean check(char[] ans, char start, int index) {
        if (start == 'z') {
            return true;
        }

        if (ans[index] == start && index < ans.length - 1) {
            if (ans[index + 1] == start) {
                return check(ans, start, index + 1);
            } else {
                return check(ans, (char) (start + 1), index + 1);
            }
        } else {
            return false;
        }
    }
}
