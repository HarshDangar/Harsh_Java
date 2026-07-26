package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Here it   is calling parent class constructor
        // used to initialize values of parent class

        System.out.println(super.h);
        // Here we can use super as well as this both represent same and call that we type

        this.weight = weight;
    }
}