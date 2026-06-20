import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaCopyOnWriteArrayList {
    public static void main(String[] args) {
        /*
            Whenever a write operation like adding or removing an element
            instead of directly modifying the existing list
            a new copy of the list is created, and the modification is applied on that copy
            This ensures that other threads reading the list while it's being modified are inaffected

            Read Operations : Fast and Direct since they happen on stable list without interference from modification
         */

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
//        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        System.out.println("Initial List: " + list);

        for (String item: list) { //Here if butter added in the loop but for loop will be ended after Bread
            System.out.println(item);
            if (item.equals("Eggs")) {
                list.add("Butter");
                System.out.println("Added butter while reading");
            }
        }
        System.out.println("Final List: " + list);
        /*
            List will give ConcurrentModificationException because write operation is happenning while reading is already running
            So here CopyOnWriteArrayList will work
         */

    }
}
