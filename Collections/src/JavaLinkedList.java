import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        /*
            The LinkedList class in Java is a part of Collection framework and implements the List interface
         */

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(2)); //O(n)
        list.addFirst(0); //O(1)
        list.addLast(5); //O(1)
        System.out.println(list);

        list.removeIf(x -> x % 2 == 0); //Given predicate for removing even elements
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(List.of("Dog"));
        animals.removeAll(animalsToRemove);

        System.out.println(animals);
    }
}
