import java.util.Collections;
import java.util.PriorityQueue;

public class P295 {
    private PriorityQueue<Integer> leftMaxHeap;
    private PriorityQueue<Integer> rightMinHeap;

    private P295() {
        leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        rightMinHeap = new PriorityQueue<>();
    }

    private void addNum(int num) {
        if (leftMaxHeap.isEmpty() || num < leftMaxHeap.peek()) { //We have to add num in leftHeap
            leftMaxHeap.add(num);
        } else {
            rightMinHeap.add(num);
        }

        //We have to maintain leftHeap size is one greater than rightMinHeap size
        //Or both size equal

        if (Math.abs(leftMaxHeap.size() - rightMinHeap.size()) > 1) {
            rightMinHeap.add(leftMaxHeap.poll());
        } else if (leftMaxHeap.size() < rightMinHeap.size()) {
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }

    private double findMedian() {
        if (leftMaxHeap.size() == rightMinHeap.size()) {
            //Total count is even
            return (double) (leftMaxHeap.peek() + rightMinHeap.peek()) / 2;
        }

        //Odd count
        return leftMaxHeap.peek();
    }
}
