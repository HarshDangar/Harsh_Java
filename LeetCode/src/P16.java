import java.util.Arrays;

public class P16 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
        System.out.println(threeSumClosest2(nums, target));
    }

    //Brute Force - O(n^3)
    private static int threeSumClosest(int[] nums, int target) {
        int dist = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int tempDist = Math.abs(target - sum);

                    if (tempDist < dist) {
                        dist = tempDist;
                        ans = sum;
                    }
                }
            }
        }
        return ans;
    }

    //Optimize with using two pointer method
    private static int threeSumClosest2(int[] nums, int target) {
        int n = nums.length;
        int closestSum = 100000;
        Arrays.sort(nums);

        for (int k = 0; k < n - 2; k++) {
            int i = k + 1;
            int j = n - 1;

            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];

                if (Math.abs(target - sum) < Math.abs(target - closestSum))
                    closestSum = sum;

                if (sum < target)
                    i++;
                else
                    j--;
            }
        }

        return closestSum;
    }
}
