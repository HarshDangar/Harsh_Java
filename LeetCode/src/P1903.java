public class P1903 {
    public static void main(String[] args) {
        String num = "354237";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i);
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
