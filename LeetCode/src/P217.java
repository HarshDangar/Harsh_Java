import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(containsDuplicate2(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > 1)
                return true;
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            if (numSet.contains(n)) {
                return true;
            }
            numSet.add(n);
        }

        return false;
    }
}
