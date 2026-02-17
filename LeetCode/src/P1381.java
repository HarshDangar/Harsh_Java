public class P1381 {
    private int list[];

    int ptr = -1;
    int maxSize;

    public P1381(int maxSize) {
        this.list = new int[maxSize];
        this.maxSize = Math.min(maxSize, 1000);
    }

    public void push(int x) {
        ptr++;
        if (ptr < maxSize) {
            list[ptr] = x;
        } else {
            ptr--;
        }
    }

    public int pop() {
        if (ptr != -1) {
            return list[ptr--];
        } else {
            return -1;
        }
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k; i++) {
            if (i <= ptr) {
                list[i] += val;
            } else
                break;
        }
    }

    public static void main(String[] args) {
        P1381 stk = new P1381(3);  // Stack is Empty []
        stk.push(1);                    // stack becomes [1]
        stk.push(2);                    // stack becomes [1, 2]
        stk.pop();                         // return 2 --> Return top of the stack 2, stack becomes [1]
        stk.push(2);                    // stack becomes [1, 2]
        stk.push(3);                    // stack becomes [1, 2, 3]
        stk.push(4);                    // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);      // stack becomes [101, 102, 103]
        stk.increment(2, 100);      // stack becomes [201, 202, 103]
        stk.pop();                        // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        stk.pop();                        // return 202 --> Return top of the stack 202, stack becomes [201]
        stk.pop();                        // return 201 --> Return top of the stack 201, stack becomes []
        stk.pop();
    }
}
