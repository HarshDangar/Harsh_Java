import java.util.HashSet;
import java.util.Set;

public class P1461 {
    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        System.out.println(hasAllCodes(s, k));
    }

    private static boolean hasAllCodes(String s, int k) {
        if (s.length() < k)
            return false;

        Set<String> set = new HashSet<>();
        int n = s.length();

        int codes = 1 << k; //Pow(2, k)

        for (int i = k; i <= n; i++) {
            String subString = s.substring(i - k, i);

            if (!set.contains(subString)) {
                set.add(subString);
                codes--;
            }

            if (codes == 0)
                return true;
        }
        return false;
    }
}
