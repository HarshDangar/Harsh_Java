import java.util.HashMap;

public class P1512 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key: map.keySet()) {
            ans += map.get(key) * (map.get(key) - 1) / 2;
        }
        return ans;
    }

    private static int numIdenticalPairs2(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i : nums) {
            if (hm.get(i) == null) {
                hm.put(i, 1);
            } else {
                ans = ans + hm.get(i);
                hm.put(i, hm.get(i) + 1);
            }
        }
        return ans;
    }
}
