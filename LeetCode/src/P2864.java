public class P2864 {
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    private static String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '0')
                zeros++;
            else
                ones++;
        }

        for (int i = 0; i < ones - 1; i++) {
            sb.append(1);
        }

        for (int i = 0; i < zeros; i++) {
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}
