import java.util.ArrayList;
import java.util.List;

public class P6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<StringBuilder> list = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        int currRow = 0;
        int signEle = 1;

        for (int i = 0; i < s.length(); i++) {
            if (currRow == numRows - 1) {
                signEle = -1;
            } else if (currRow == 0) {
                signEle = 1;
            }
            list.get(currRow).append(String.valueOf(s.charAt(i)));
            currRow += signEle;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder str : list) {
            ans.append(str);
        }
        return ans.toString();
    }
}
