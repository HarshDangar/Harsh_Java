import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P229 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    private static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int target = nums.length / 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > target) {
                if (!ans.contains(num))
                    ans.add(num);
            }
        }
        return ans;
    }
}
