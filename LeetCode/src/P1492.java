import java.util.ArrayList;

public class P1492 {
    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
    }

    private static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
            if (list.size() == k)
                return list.get(k - 1);
        }

        return -1;
    }
}
