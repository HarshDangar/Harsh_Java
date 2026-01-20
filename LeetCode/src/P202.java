import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P202 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        return check(n, list);
    }

    private static boolean check(int n, List<Integer> list) {
        if (n == 1)
            return true;

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        if (list.contains(sum))
            return false;
        else
            list.add(sum);

        return check(sum, list);
    }
}
