import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrentHashMap {
    public static void main(String[] args) {
        /*
            ConcurrentHashMap implements ConcurrentMap which extends Map interface
            It is synchronized that's why it is thread safe HashMap
         */

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    }
}
