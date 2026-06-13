import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P219 {
    //Classic approach
    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (mp.containsKey(val) && i - mp.get(val) <= k) {
                return true;
            }
            mp.put(val, i);
        }
        return false;
    }

    //Sliding Window
    private static boolean containsNearbyDuplicate2(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        int i = 0, j = 0;

        while (j < n) {
            if (Math.abs(i - j) > k) {
                set.remove(nums[i]);
                i++;
            }

            if (set.contains(nums[j])) {
                return true;
            }

            set.add(nums[j]);
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearbyDuplicate2(nums, k));
    }
}
