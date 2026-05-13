import java.util.Arrays;
import java.util.Stack;

public class P735 {
    public static void main(String[] args) {
        int[] asteroids = {3, 5, -6, 2, -1, 4};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            //When collision happens
            while (!stack.empty() && asteroid < 0 && stack.peek() > 0) {
                int sum = asteroid + stack.peek();

                if (sum < 0) {
                    //The direction is negative than that positive element is removed and further checks can be done
                    stack.pop();
                } else if (sum > 0) {
                    //No need to add negative element in the stack simply ignore the element
                    asteroid = 0; //While loop will break
                } else {
                    //Sum = 0 we have to remove the top element and continue without
                    stack.pop();
                    asteroid = 0;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
