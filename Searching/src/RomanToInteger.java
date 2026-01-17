import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the roman String : ");
        String x = in.next();
        System.out.println(romanToInt(x));
    }

    static int romanToInt(String s){

        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        */

        int sum = 0;
        int mainIndex = s.length()-1;
        String romanChar = "IVXLCDM";
        int[] value = {1,5,10,50,100,500,1000};

        while (mainIndex > 0){
            int index1 = romanChar.indexOf(s.charAt(mainIndex - 1));
            int index2 = romanChar.indexOf(s.charAt(mainIndex));

            if (index1 < index2){
                sum = sum + value[index2] - value[index1];
                mainIndex -= 2;
            } else {
                sum = sum + value[index2];
                mainIndex -= 1;
            }
        }

        if (mainIndex == 0){
            sum = value[romanChar.indexOf(s.charAt(mainIndex))] + sum;
        }
        return sum;
    }
}
