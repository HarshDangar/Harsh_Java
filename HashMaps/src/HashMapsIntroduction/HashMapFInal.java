package HashMapsIntroduction;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFInal<K , V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public HashMapFInal() {
        list = new ArrayList<>();
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
