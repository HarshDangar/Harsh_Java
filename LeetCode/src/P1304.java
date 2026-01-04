import java.util.Arrays;

public class P1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
    }

    public static int[] sumZero(int n) {
        int num;
        int[] arr = new int[n];
        if (n % 2 == 0) {
            num = n / 2;
        } else {
            num = (n - 1) / 2;
            arr[n - 1] = 0;
        }
        for (int i = 1; i <= num; i++) {
            arr[i - 1] = i;
            arr[num + i - 1] = -i;
        }
        return arr;
    }

    public static int[] sumZero2(int n) {
        int[] res = new int[n];
        res[0] = n * (1 - n) / 2;
        for (int i = 1; i < n; ++i)
            res[i] = i;
        return res;
    }
}
