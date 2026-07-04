import java.util.Stack;

public class P962 {
    public static void main(String[] args) {
        int[] nums = {9, 8, 1, 0, 1, 9, 4, 0, 4, 1};
        System.out.println(maxWidthRamp(nums));
        System.out.println(maxWidthRamp2(nums));
        System.out.println(maxWidthRamp3(nums));
        System.out.println(maxWidthRamp4(nums));
    }

    //Brute Force - TLE
    private static int maxWidthRamp(int[] nums) {
        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    res = Integer.max(res, j - i);
                }
            }
        }
        return res;
    }

    //Better Brute Force - TLE
    private static int maxWidthRamp2(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] <= nums[j]) {
                    res = Integer.max(res, j - i);
                    break;
                }
            }
        }
        return res;
    }

    //Best Approach
    private static int maxWidthRamp3(int[] nums) {
        int n = nums.length;

        int[] rightToMax = new int[n]; //So rightToMax array will tell max element for any index in the right part
        // Suppose i = 1 then it will tell the max element in the right part from i to n - 1
        rightToMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightToMax[i] = Integer.max(rightToMax[i + 1], nums[i]);
        }

        int ramp = 0;
        int i = 0; //nums
        int j = 0; //rightToMax

        while (j < n) {
            while (i < j && nums[i] > rightToMax[j]) {
                i++;
            }

            ramp = Integer.max(ramp, j - i);
            j++;
        }
        return ramp;
    }

    //Monotonic Stack : O(2 * n) == O(n)
    private static int maxWidthRamp4(int[] nums) {
        int n  = nums.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[i] <= nums[stack.peek()]) {
                stack.push(i);
            }
        }
        
        int ramp = 0;

        int j = n - 1;
        while (j >= 0) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                int i = stack.peek();
                ramp = Math.max(ramp, j - i);
                stack.pop();
            }
            j--;
        }

        return ramp;
    }
}
