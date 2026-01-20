// this solution satisfy the three cases in leetcode but it will give runtime error so 2nd solution will be better.

public class P1967 {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    private static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            char[] temp = patterns[i].toCharArray();

            if (temp.length == 1) {
                if (word.indexOf(temp[0]) != -1) {
                    count++;
                }
            } else {
                if (check(temp, word) == true) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean check(char[] temp, String word) {
        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            if (temp[0] == word.charAt(i)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        } else {
            String finalCheck = word.substring(index, index + temp.length);
            String tempString = String.valueOf(temp);

            if (finalCheck.equals(tempString)) {
                return true;
            }
        }
        return false;
    }
}
