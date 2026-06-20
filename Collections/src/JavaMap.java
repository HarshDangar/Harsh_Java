import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {
        /*
            Map is interface that does not extend Collection interface
            It is not thread safe
         */

        HashMap<Integer, String> map = new HashMap<>();
        /*
            HashMap have no order for the Key Value pairs
         */
        map.put(1, "Harsh");
        map.put(2, "Denish");
        map.put(3, "Parthiv");

        System.out.println(map);
        System.out.println(map.get(34)); //The ans will be null

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
