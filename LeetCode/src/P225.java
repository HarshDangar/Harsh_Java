import java.util.LinkedList;
import java.util.Queue;

public class P225 {
    private Queue<Integer> queue = new LinkedList<>();

    public P225() {

    }

    public void push(int x) {
        int size = queue.size();
        queue.add(x);

        for (int i = 0; i < size; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty())
            return -1;

        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty())
            return -1;

        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        P225 sol = new P225();
        sol.push(1);
        sol.push(2);
        sol.push(3);
        sol.push(4);
        sol.push(5);
    }
}
