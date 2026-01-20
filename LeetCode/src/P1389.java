import java.util.ArrayList;
import java.util.Arrays;

public class P1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray2(nums, index)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target, -1);

        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] < 0) {
                target[index[i]] = nums[i];
            } else {
                for (int j = nums.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }

        return target;
    }

    private static int[] createTargetArray2(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = index[i];
            ans.add(j, nums[i]);
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}
