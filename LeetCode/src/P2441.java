import java.util.Arrays;
import java.util.HashSet;

public class P2441 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        System.out.println(findMaxK(nums));
        System.out.println(findMaxK2(nums));
        System.out.println(findMaxK3(nums));
        System.out.println(findMaxK4(nums));
    }

    private static int findMaxK(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == val * -1)
                    ans = Math.max(ans, Math.abs(nums[j]));
            }
        }
        return ans;
    }

    private static int findMaxK2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;

        while (i < j) {
            if (-nums[i] == nums[j])
                return nums[j];
            else if (-nums[i] < nums[j])
                j--;
            else
                i++;
        }
        return -1;
    }

    private static int findMaxK3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = -1;

        for (int num : nums) {
            if (set.contains(-num)) {
                result = Math.max(result, Math.abs(num));
            }
            set.add(num);
        }

        return result;
    }

    private static int findMaxK4(int[] nums) {
        int result = -1;
        int[] arr = new int[2001];

        for (int num : nums) {
            if (arr[-num + 1000] == 1) {
                result = Math.max(result, Math.abs(num));
            }
            // Mark the current number as seen
            arr[num + 1000] = 1;
        }

        return result;   
    }
}
