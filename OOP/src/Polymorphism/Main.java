package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.area();
        triangle.area();
        shape.area();
        square.area();

        //Runtime Polymorphism
        Shapes shapes = new Circle();
        shapes.area();
    }
}
