package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34);
//        list2.add(76);
//        list2.add(31);
//        list2.add(45);

//        System.out.println(list2);

        List<Integer> vector = new Vector<>();

        vector.add(34);
        vector.add(76);
        vector.add(31);
        vector.add(45);

        System.out.println(vector);
     }
}
