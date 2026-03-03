import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {
    //Prime red book page no 93

    /*
        Next greater element
        we need to find element ans store it in the array that is right next from the index and greater
     */
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 3};
        System.out.println(Arrays.toString(nextGreater(nums)));
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    private static int[] nextGreater(int[] nums) {
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();

            stack.push(nums[i]);
        }
        return ans;
    }

    // P739 Decreasing stack
    private static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}
