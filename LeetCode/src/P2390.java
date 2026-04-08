public class P2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if (c != '*') sb.append(c);
            else sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
