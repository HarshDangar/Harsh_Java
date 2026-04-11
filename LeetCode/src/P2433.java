import java.util.Arrays;

public class P2433 {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(pref)));
    }

    private static int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        int temp = 0;

        for (int i = 1; i < pref.length; i++) {
            temp ^= ans[i - 1];
            ans[i] = pref[i] ^ temp;
        }
        return ans;
    }
}
