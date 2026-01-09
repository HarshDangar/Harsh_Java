public class Questions {
    public static void main(String[] args) {
        int num = 56;
        System.out.println(isOdd(num));
    }

    public static boolean isOdd(int nums) {
        return (nums & 1) == 1;
    }
}

