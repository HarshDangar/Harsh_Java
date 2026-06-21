public class Main {
    public static void main(String[] args) {
        /*
            A thread is the smallest unit of execution within a process.
            A process can have multiple threads, which share a same resources but can run independently
         */

        System.out.println(Thread.currentThread().getName());
        Test test = new Test(); //NEW
        test.start(); //RUNNABLE

        /*
            One method for thread is extends Thread
            Another is implements Runnable
         */

        Test test1 = new Test();
        Thread thread = new Thread(test1);
        thread.start();

        /*
            Thread Lifecycle
            1. New - Created but not started
            2. Runnable - Ready to run and is waiting for CPU time
            3. Running - Executing
            4. Blocked/Waiting - Waiting for a resource
            5. Terminated - Finished Executing
         */
    }
}
