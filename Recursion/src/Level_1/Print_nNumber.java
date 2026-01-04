package Level_1;

import java.util.Scanner;

public class Print_nNumber {
    public static void main(String[] args) {
         // print n numbers from maximum to minimum until you reach 1
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        ans(num);
    }

    static void ans(int i){
        if (i == 0){
            return ;
        }

        System.out.print(i);
        ans(i-1);
    }
}
