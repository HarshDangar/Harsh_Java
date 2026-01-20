public class P557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder finalAns = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {
            StringBuilder sb = new StringBuilder(temp[i]);
            finalAns.append(sb.reverse()).append(" ");
        }

        finalAns.deleteCharAt(finalAns.length() - 1);
        return finalAns.toString();
    }
}
