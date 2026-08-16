public class P2264 {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }

    private static String largestGoodInteger(String num) {
        char max = ' ';

        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                max = (char) Math.max(max, num.charAt(i));
            }
        }

        return max == ' ' ? "" : new String(new char[] { max, max, max });
    }
}
