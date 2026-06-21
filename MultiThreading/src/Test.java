public class Test extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }
}
