import java.util.ArrayList;
import java.util.List;

public class P39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    static List<List<Integer>> ans;
    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    private static void solve(int[] candidates, int target, int currIdx, List<Integer> curr) {
        if (target < 0 || currIdx == candidates.length) {
            return;
        }

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (candidates[currIdx] <= target) {
            curr.add(candidates[currIdx]);
            //Pick the element
            solve(candidates, target - candidates[currIdx], currIdx, curr);
            curr.removeLast();
        }

        solve(candidates, target, currIdx + 1, curr);
    }
}
