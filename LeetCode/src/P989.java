import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P989 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5};
        int k = 806;
        System.out.println(addToArrayForm(arr, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }

            list.add(k % 10);
            k /= 10;
            i--;
        }

        Collections.reverse(list);
        return list;
    }
}
