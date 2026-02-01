import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P119 {
    public static void main(String[] args) {
        int rowIndex = 33;
        System.out.println(getRow(rowIndex));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        list.add(Arrays.asList(1,1));

        if (rowIndex <= 1)
            return list.get(rowIndex);

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    inner.add(1);
                else {
                    int previous1 = list.get(i - 1).get(j - 1);
                    int previous2 = list.get(i - 1).get(j);
                    inner.add(previous1 + previous2);
                }
            }
            list.add(inner);
        }
        return list.get(rowIndex);
    }
}
