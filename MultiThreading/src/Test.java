public class Test extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());
//    }

    public static void main(String[] args) {
        /*
            To understand why `synchronized` is necessary,
            you have to look at what `count++` actually does internally.
            It is not one single atomic action; it is three distinct steps:

            1.  Read the current value of `count`.
            2.  Increment that value.
            3.  Write the new value back to memory.

            The Race Condition:
            Imagine `count` is currently 100, and two threads run `count++` at the same time:

            •	Thread A reads the value: 100.
            •	Thread B reads the value: 100.
            •	Thread A increments it to 101.
            •	Thread B increments it to 101.
            •	Thread A writes back: 101.
            •	Thread B writes back: 101.

            The Problem: The count should be 102 because two threads incremented it,
            but it's only 101 because they both read the same initial value and overwrote each other's work!
            The `synchronized` keyword ensures only one thread can complete all three steps at a time.
         */
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
