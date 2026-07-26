public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    /*
        So here synchronized keyword will complete the whole thread and than another thread it's work

        public void increment() {
            synchronized (this) {
                count++;
            }
        }

        we also can use synchronized block
    */

    public int getCount() {
        return count;
    }
}
