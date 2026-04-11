import java.util.Arrays;

public class P338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits2(5)));
    }

    private static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = count(i);
        }

        return ans;
    }

    private static int count(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    private static int[] countBits2(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1); //i >> 1 == i / 2 + last bit if no is odd than add 1 if even than add 0
        }
        return ans;
    }

    private static int[] countBits3(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                ans[i] = ans[i / 2] + 1;
            else
                ans[i] = ans[i / 2];
        }
        return ans;
    }
}
