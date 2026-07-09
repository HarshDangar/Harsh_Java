import java.util.HashSet;
import java.util.Set;

public class P3719 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 3};
        System.out.println(longestBalanced(nums));
    }

    private static int longestBalanced(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0)
                    evenSet.add(nums[j]);
                else
                    oddSet.add(nums[j]);

                if (evenSet.size() == oddSet.size())
                    ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}
