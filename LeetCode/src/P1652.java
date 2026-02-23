import java.util.Arrays;

public class P1652 {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(code, k)));
    }

    private static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0)
            return ans;

        int total = 0;
        int start = (k > 0) ? 1 : n + k;
        int end = (k > 0) ? k : n - 1;

        for (int i = start; i <= end; i++) {
            total += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = total;
            total -= code[(start + i) % n];
            total += code[(end + i + 1) % n];
        }

        return ans;
    }
}
