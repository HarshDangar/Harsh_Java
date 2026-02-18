public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);

        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(8);
        queue.insert(9);

        queue.display();

        System.out.println(queue.remove());

        queue.display();

        queue.insert(55);
        queue.display();


        CircularQueue queue2 = new CircularQueue(5);

        queue2.insert(4);
        queue2.insert(5);
        queue2.insert(6);
        queue2.insert(8);
        queue2.insert(9);

        queue2.display();

        queue2.remove();

        queue2.display();
    }
}
