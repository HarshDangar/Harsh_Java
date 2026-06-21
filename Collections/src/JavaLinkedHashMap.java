import java.util.LinkedHashMap;

public class JavaLinkedHashMap {
    public static void main(String[] args) {
        /*
            LinkedHashMap is class which extends HashMap and implements Map
            It has order collection of elements
            It is not thread safe
         */

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Denish", 1);
        map.put("Harsh", 2);
        map.put("Saheel", 3);
        map.put("Parthiv", 4);

        System.out.println(map);

        System.out.println(map.getOrDefault("Parthiv", 0));
    }
}
