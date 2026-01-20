public class P168 {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Here columnumber is minus by one because zero remainder ke liye kuch nahi hai hamare pass.
            int remainder = columnNumber % 26;
            sb.append((char) (remainder + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
