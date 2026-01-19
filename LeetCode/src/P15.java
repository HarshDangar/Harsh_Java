import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // skip duplicate after one is already checked

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    //Here it is possible that we have duplicate number ahead so we skip the number till duplicate ends
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }

        return ans;
    }
}
