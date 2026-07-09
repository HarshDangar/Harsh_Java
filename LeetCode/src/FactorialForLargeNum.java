import java.util.ArrayList;

public class FactorialForLargeNum {
    //GFG - https://www.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1

    static int size = 1;
    private static ArrayList<Integer> factorial(int n) {
        int[] arr = new int[100000];

        arr[0] = 1;

        for(int multiplier = 2; multiplier <= n; multiplier++) {
            multiply(arr, multiplier);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = size - 1; i >= 0; i--) {
            result.add(arr[i]);
        }
        return result;
    }

    private static void multiply(int[] arr, int multiplier) {
        int carry = 0;

        for(int i = 0; i < size; i++) {
            int res = multiplier * arr[i];

            res = res + carry;

            arr[i] = res % 10;

            carry = res / 10;
        }

        //Carry can be large like 12
        while(carry > 0) {
            arr[size] = carry % 10;
            size++;
            carry /= 10;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }
}
