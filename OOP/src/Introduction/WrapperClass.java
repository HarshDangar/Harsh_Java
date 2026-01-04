package Introduction;

public class WrapperClass {
    public static void main(String[] args) {
        final A harsh = new A();
        harsh.name = "Denish";
        // here we're changing value which is fine

//        harsh = new A();
        // here we cant make this because this is final that's why it cant me modified

        Student denish = new Student();
        System.out.println(denish.name);
    }
}

class A {
    final int rollno = 10;
    String name;
}
