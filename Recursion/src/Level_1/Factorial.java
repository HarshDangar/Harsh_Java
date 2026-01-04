package Level_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Factorial of number

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int i){
        if (i <= 1)
            return 1;

        return i * fact(i-1);
    }
}
