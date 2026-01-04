package Problems;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum(arr);
    }

    public static void sum(int[] arr) {
        if (arr.length < 1)
            return;

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        sum(temp);

        System.out.println(Arrays.toString(arr));
    }
}
