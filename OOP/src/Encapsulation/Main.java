package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.setName("Harsh");
        test.setAge(22);
        test.setIdNum("12345");

        System.out.println("Name : " + test.getName() + " Age : " + test.getAge());
    }
}
