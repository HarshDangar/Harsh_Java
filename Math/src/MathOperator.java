public class MathOperator {
    public static void main(String[] args) {
        // a & 1 = a
        System.out.println(36 & 1);

        /* Xor Operator
            a ^ 1 = ~a (compliment)
            a ^ 0 = a
            a ^ a = 0
        */

        /* Left shift
         a << 1 = 2a
         In general a << b = a * (2 ^ b)  (a * 2 power b)
        */

        System.out.println(28 << 1);
        System.out.println(2 << 5);
    }
}
