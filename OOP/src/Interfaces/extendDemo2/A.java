package Interfaces.extendDemo2;

public interface A {

    // static have body to use as interface
    // call via the interface name

    static void greeting()
    {
        System.out.println("Hey i am a static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
