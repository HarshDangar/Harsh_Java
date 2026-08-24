import java.util.LinkedList;
import java.util.Queue;

public class P1700 {
    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1}, sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students, sandwiches));
    }

    private static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stQueue = new LinkedList<>();
        Queue<Integer> swQueue = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {
            swQueue.add(sandwiches[i]);
            stQueue.add(students[i]);
        }

        int count = 0;
        while (!stQueue.isEmpty() && count < stQueue.size()) {
            if (stQueue.peek().equals(swQueue.peek())) {
                stQueue.poll();
                swQueue.poll();
                count = 0;
            } else {
                int val = stQueue.poll();
                stQueue.add(val);
                count++;
            }
        }

        return stQueue.size();
    }
}
