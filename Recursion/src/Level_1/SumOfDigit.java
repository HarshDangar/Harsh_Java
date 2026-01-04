package Level_1;

public class SumOfDigit {

//     sum of digit

    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    static int sum(int num){
        if(num == 0)
            return 0;

        int digit = num % 10;
        return digit + sum(num/10);
    }
}
