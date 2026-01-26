import java.util.ArrayList;
import java.util.List;

public class P46 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permute(nums));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<Integer> up = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            up.add(nums[i]);
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
}
