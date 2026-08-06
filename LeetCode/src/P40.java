import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    static List<List<Integer>> ans = new ArrayList<>();

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        solve(candidates, target, curr, 0);
        return ans;
    }

    private static void solve(int[] candidates, int target, List<Integer> curr, int currIdx) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = currIdx; i < candidates.length; i++) {
            if (i > currIdx && candidates[i] == candidates[i - 1]) {
                continue; // Ignore duplicate elements
            }
            curr.add(candidates[i]);
            solve(candidates, target - candidates[i], curr, i + 1);
            curr.removeLast();
        }
    }
}
