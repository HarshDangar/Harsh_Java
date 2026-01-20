public class P1784 {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }

    private static boolean checkOnesSegment(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }
}
