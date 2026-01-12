import java.util.Arrays;

public class P338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits2(5)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = count(i);
        }

        return ans;
    }

    public static int count(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static int[] countBits2(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
