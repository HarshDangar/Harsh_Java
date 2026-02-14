import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertFirst(11);
        list1.insertFirst(14);
        list1.insertFirst(11);
        list1.insertFirst(12);
        list1.insertFirst(11);
        list1.insertLast(16);

        list1.insert(99,3);
        list1.display();

        DLL list2 = new DLL();
        list2.insertFirst(15);
        list2.insertFirst(14);
        list2.insertFirst(13);
        list2.insertFirst(12);
        list2.insertFirst(11);
        list2.insertLast(16);
        list2.insert(12,88);

        list2.display();

        CLL list3 = new CLL();

        list3.insert(15);
        list3.insert(16);
        list3.insert(17);
        list3.insert(18);
        list3.insert(19);
        list3.insert(20);

        list3.display();

//        list3.insertRec(88,3);
//        list3.display();
//
//        list3.removeDuplicates();
//        list3.display();
    }
}
