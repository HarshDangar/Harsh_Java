import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class P2751 {
    public static void main(String[] args) {
        int[] positions = {3,5,2,6};
        int[] healths = {10,10,15,12};
        String directions = "RLRL";
        System.out.println(survivedRobotsHealths(positions, healths, directions));
    }

    private static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Stack<Integer> stack = new Stack<>();

        Arrays.sort(indices, (i, j) -> Integer.compare(positions[i], positions[j]));
        //Lambda position[i] < position[j] => true otherwise false [0,1,2,3] => [2,0,1,3]

        List<Integer> result = new ArrayList<>();

        for (int currentIndex: indices) {
            if (directions.charAt(currentIndex) == 'R') {
                stack.push(currentIndex);
            } else {
                while (!stack.isEmpty() && healths[currentIndex] > 0) {
                    int topIndex = stack.pop();

                    if (healths[topIndex] > healths[currentIndex]) {
                        healths[topIndex] -= 1;
                        healths[currentIndex] = 0;
                        stack.push(topIndex); // because we have popped the top
                    } else if (healths[topIndex] < healths[currentIndex]) {
                        healths[currentIndex] -= 1;
                        healths[topIndex] = 0; //Here we dont pop the top because it already popped
                    } else { //Same health
                        healths[currentIndex] = 0;
                        healths[topIndex] = 0; //Here we also dont have to popped the top because it is already popped
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                result.add(healths[i]);
            }
        }
        return result;
    }
}
