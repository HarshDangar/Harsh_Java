import java.util.Arrays;

public class P1720 {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
    }

    private static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];

        arr[0] = first;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }

        return arr;
    }
}
