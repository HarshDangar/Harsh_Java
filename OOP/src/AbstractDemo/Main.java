package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();
        daughter.partner();

        Parent.hello();
//        Parent mom = new Parent(45);
    }
}
