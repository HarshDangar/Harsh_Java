
public class P58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String[] temp = s.split(" ");

        return temp[temp.length - 1].length();
    }
}
