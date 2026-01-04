package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human harsh = new Human(23, "harsh");
//        Human twin = new Human(harsh);

        // Here it takes lot of runtime or it load the system more with new keyword that's why we can use cloning
        Human twin = (Human) harsh.clone();

        System.out.println(twin.age + " " + twin.name);

    }
}
