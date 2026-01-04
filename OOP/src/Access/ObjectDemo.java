package Access;

import Inheritance.Main;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34);
        // Here hashcode give random integer number and it is different for objects who have pass same num
        System.out.println(obj1.hashCode());

        ObjectDemo obj2 = new ObjectDemo(12, 78.99f);
        ObjectDemo obj3 = new ObjectDemo(12, 78.99f);

        if (obj2 == obj3){
            System.out.println("obj2 is equal to obj3");
        }

        // Here == is checking obj2 and obj3 are pointing to same object or not

        if (obj2.equals(obj3)){
            System.out.println("obj2 is equal to obj3");
        }

        // But here equals to is checking contents of obj2 and obj3 are same or not;
    }
}
