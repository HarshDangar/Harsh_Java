package HashMapsIntroduction;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map.get("Apple"));
    }

    public static void hashDemo() {
//        String name = "Rahul";
//        int code = name.hashCode();
//        System.out.println(code);

        TreeMap<String , Integer> map = new TreeMap<>();

        map.put("Harsh" , 83);
        map.put("Denish" , 76);
        map.put("Saheel" , 86);

        System.out.println(map.get("Denish"));
        System.out.println(map.containsKey("Harsh"));

        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);
    }
}
