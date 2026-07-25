package Polymorphism;

public class Circle extends Shapes{

    //Override is used for Runtime Polymorphism // Method overriding
    @Override
    void area() {
         System.out.println("Area is pi * r * r");
     }
}
