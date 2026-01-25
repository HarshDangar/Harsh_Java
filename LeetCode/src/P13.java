public class P13 {
    public static void main(String[] args) {
        String s = "MMMCMXCIX";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        int sum = 0;
        int mainIndex = s.length() - 1;
        String romanChar = "IVXLCDM";
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        while (mainIndex > 0) {
            int index1 = romanChar.indexOf(s.charAt(mainIndex - 1));
            int index2 = romanChar.indexOf(s.charAt(mainIndex));

            if (index1 < index2) {
                sum = sum + value[index2] - value[index1];
                mainIndex -= 2;
            } else {
                sum = sum + value[index2];
                mainIndex -= 1;
            }
        }

        if (mainIndex == 0) {
            sum = value[romanChar.indexOf(s.charAt(mainIndex))] + sum;
        }
        return sum;
    }
}
