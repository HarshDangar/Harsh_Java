public class P12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    private static String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        StringBuilder ans = new StringBuilder();

        int index = 0;

        while (num > 0) {
            while (num >= values[index]) {
                num -= values[index];
                ans.append(roman[index]);
            }
            //If inner while loop is end meaning the roman is checked at index position
            index++;
        }

        return ans.toString();
    }
}
