import java.util.ArrayList;
import java.util.List;

public class P216 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }

    static List<List<Integer>> ans = new ArrayList<>();
    private static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> curr = new ArrayList<>();
        solve(1, curr, k, n);
        return ans;
    }

    private static void solve(int num, List<Integer> curr, int k, int target) {
        if (target == 0 && curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (num >= 10 || target < 0)
            return;

        for (int i = num; i < 10; i++) {
            curr.add(i);
            solve(i + 1, curr, k, target - i);
            curr.removeLast();
        }
    }
}
