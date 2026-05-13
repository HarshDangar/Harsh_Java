import java.util.ArrayDeque;
import java.util.Deque;

public class P933 {
    Deque<Integer> deque;

    private P933() {
        deque =  new ArrayDeque<>();
    }

    private int ping(int t) {
        deque.addLast(t);

        while (t - deque.getFirst() > 3000) {
            deque.removeFirst();
        }

        return deque.size();
    }

    public static void main(String[] args) {
        P933 recentCounter = new P933();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}
