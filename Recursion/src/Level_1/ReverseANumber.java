package Level_1;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(palin(123215));
    }

    static int reverse(int num){

        if (num == 0)
            return 0;

        int digits = (int)(Math.log10(num)) + 1;
        return helper(num , digits);
    }

    private static int helper(int i, int digits) {
        if (i % 10 == i)
            return i;

        return (i % 10) * (int)(Math.pow(10 , digits - 1)) + helper(i / 10 , digits - 1);
    }

    static boolean palin(int n){
        return n == reverse(n);
    }
}
