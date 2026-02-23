import java.util.Stack;

public class P232 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public P232() {
        first = new Stack<>();
        second = new Stack<>();
    }

    //Currently we are making insertion efficient queue so in this the insertion happen in O(1)
    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
