import java.util.ArrayList;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        /* List is the interface which is sub interface of Collection
            ArrayList, LinkedList, Vector and Stack
            Arraylist is created with initial capacity of 10
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(123);

//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        for (int x: arrayList) {
//            System.out.println(x);
//        }

        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.add(1246);
        System.out.println(arrayList);

        arrayList.add(1, 24); //ArrayList will push all the elements to the right and add the new element
        System.out.println(arrayList);

        /*
            ArrayList Initial Capacity = 10
            Growth Factor = 1.5
            If internal array is full than new array is created with size 1.5 times the old array
         */
        ArrayList<Integer> arrayList1 = new ArrayList<>(1000);
        //We can set initial capacity of arraylist

        List<Integer> list = List.of(4, 5, 6, 7, 8);
        //It is immutable list so we can't add elements in this list with method like list.add
        System.out.println(list);

        arrayList1.addAll(list); //addAll(Collection)
        System.out.println(arrayList1);

        arrayList1.remove(Integer.valueOf(6));
        //Integer.valueOf(element) will turn integer into object
        System.out.println(arrayList1);
    }
}