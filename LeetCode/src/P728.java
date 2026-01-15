import java.util.ArrayList;
import java.util.List;

public class P728 {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10)
                list.add(i);
            else if (check(i))
                list.add(i);
        }
        return list;
    }

    public static boolean check(int num) {
        int temp = num;
        
        while (temp > 0) {
            int rem = temp % 10;

            if (rem == 0)
                return false;

            if (num % rem != 0)
                return false;
            temp /= 10;
        }
        
        return true;
    }

}
