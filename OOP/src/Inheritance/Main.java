package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.5, 7.3, 8.7);
        Box box2 = new Box(box1);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);

        System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);
        System.out.println(box4.weight);

        Box box5 = new BoxWeight(1,5,3,8);
        // here box5 id created with box that's why we cant access weight with box5

        // System.out.println(box5.weight);
        // it will give error with box5.weight

        BoxPrice box6 = new BoxPrice();
        System.out.println(box6.cost);

        BoxPrice box7 = new BoxPrice(4 , 7, 200);
        System.out.println(box7.cost);
    }
}
