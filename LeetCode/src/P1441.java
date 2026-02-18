import java.util.ArrayList;
import java.util.List;

public class P1441 {
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
        System.out.println(buildArray(target, n));
    }

    private static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int ele = 1;
        int index = 0;

        while(ele <= n && index < target.length) {
            if (ele == target[index]) {
                list.add("Push");
                index++;
                ele++;
            } else {
                list.add("Push");
                list.add("Pop");
                ele++;
            }
        }
        return list;
    }
}
