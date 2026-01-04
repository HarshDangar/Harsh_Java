package Interfaces.Nested;

public class A {
    public interface NestedIInterface {
        // nested Interface
        boolean isOdd(int num);
    }
}

class B implements A.NestedIInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
