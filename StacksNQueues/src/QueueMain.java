import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue queue = new CustomQueue(5);

//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(8);
//        queue.insert(9);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();
//
//        queue.insert(55);
//        queue.display();


        CircularQueue queue = new CircularQueue(5);

        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(8);
        queue.insert(9);

        queue.display();

        queue.remove();

        queue.display();
    }
}
