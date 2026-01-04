

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        System.out.println(romanToInt(x));
    }

    static int romanToInt(String a){
        int ans = 0;
        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

         */

        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)){
                case 'I' -> ans += 1;
                case 'V' -> ans += 5;
                case 'X' -> ans += 10;
                case 'L' -> ans += 50;
                case 'C' -> ans += 100;
                case 'D' -> ans += 500;
                case 'M' -> ans += 1000;
                default -> ans = -1;
            }
        }
        return ans;
    }
}
