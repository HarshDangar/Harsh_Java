import java.util.HashMap;

public class P1512 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs2(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    public static int numIdenticalPairs2(int[] nums) {
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
