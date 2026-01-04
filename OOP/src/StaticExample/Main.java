package StaticExample;

public class Main {
    public static void main(String[] args) {

        System.out.println(Human.population);

        // Here objects are not created but we are usind before the reason is simple because we can use static variable withous making objects like harsh and denish

        Human harsh = new Human(11 , "Harsh" , 10000 , false);
        Human denish = new Human(18 , "Denish" , 15000 , true);

        // Here harsh and denish works fine but dont use it use the class name instead of harsh and denish it also applies in constructor
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
