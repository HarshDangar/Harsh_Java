import java.util.ArrayList;

public class P155 {
    private ArrayList<Integer> list;

    int ptr = -1;
    int min = Integer.MAX_VALUE;

    private P155() {
        this.list = new ArrayList<>();
    }

    private void push(int val) {
        ptr++;

        if (val < min)
            min = val;

        list.add(val);
    }

    private void pop() {
        list.remove(ptr);

        min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < min)
                min = integer;
        }

        ptr--;
    }

    private int top() {
        return list.get(ptr);
    }

    private int getMin() {
        return min;
    }

    public static void main(String[] args) {
        P155 minStack = new P155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        minStack.top();    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
