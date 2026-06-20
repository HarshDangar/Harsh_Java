import java.util.Vector;

public class JavaVectors {
    public static void main(String[] args) {
        /*
            Java Vectors are thread safe unlike arrayList and LinkedList
            It is almost similar like arrayList
         */

        Vector<Integer> vector = new Vector<>(15, 3);
        System.out.println(vector.capacity());

        /*
            In modern Java Applications, ArrayList is generally preffered over Vector when synchronization isn't needed.
            For thread safe collection CopyOnWriteArrayList or ConcurrentHashMap is often recommended instead.
         */
    }
}
