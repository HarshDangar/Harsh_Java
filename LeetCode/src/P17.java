import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P17 {
    public static void main(String[] args) {
        String digits = "2";
        System.out.println(letterCombinations(digits));
    }

    static List<String> ans = new ArrayList<>();
    private static List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder curr = new StringBuilder();

        solve(0, digits, curr, map);

        return ans;
    }

    private static void solve(int idx, String digits, StringBuilder curr, HashMap<Character, String> map) {
        if (idx >= digits.length()) {
            ans.add(curr.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String str = map.get(ch);

        for (int i = 0; i < str.length(); i++) {
            curr.append(str.charAt(i));
            solve(idx + 1, digits, curr, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
