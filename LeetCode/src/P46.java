import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
        System.out.println(permute2(nums));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<Integer> up = new ArrayList<>();

        for (int num : nums) {
            up.add(num);
        }

        return permutation(new ArrayList<>(), up);
    }

    public static List<List<Integer>> permutation(List<Integer> p, List<Integer> up) {
        if (up.isEmpty()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int in = up.getFirst();

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= p.size(); i++) {
            List<Integer> first = p.subList(0, i);
            List<Integer> second = p.subList(i, p.size());

            //Now up will be first + element + second
            //Exa "" + 2 + "" = [2] == p and remaining in up
            List<Integer> temp = new ArrayList<>(first);
            temp.add(in);
            temp.addAll(second);
            
            ans.addAll(permutation(temp, up.subList(1,up.size())));
        }
        return ans;
    }

    //Approach 2 : Backtracking O(n * n!)
    static int n;
    static List<List<Integer>> result;
    static ArrayList<Integer> set;
    private static List<List<Integer>> permute2(int[] nums) {
        n = nums.length;

        List<Integer> temp;

        solve(new ArrayList<>(), nums);

        return result;
    }

    private static void solve(List<Integer> temp, int[] nums) {
        if (temp.size() == n) {
            result.add(temp);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!set.contains(nums[i])) {
                temp.add(nums[i]);

                solve(temp, nums);

                temp.remove(nums[i]);
                set.remove(nums[i]);
            }
        }
    }
}
