public class P1071 {
    public static void main(String[] args) {
        String str1 = "LEET";
        String str2 = "CODE";

        System.out.println(gcdOfStrings(str1, str2));
    }

    private static String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2))
            return str1;

        if (str1.length() > str2.length()) {
            boolean res = str1.endsWith(str2);
            if (res) {
                return gcdOfStrings(str1.substring(0, str1.length() - str2.length()), str2);
            }
        } else {
            boolean res = str2.endsWith(str1);
            if (res) {
                return gcdOfStrings(str1, str2.substring(0, str2.length() - str1.length()));
            }
        }
        return "";
    }
}
