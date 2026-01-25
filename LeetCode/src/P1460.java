import java.util.Arrays;

public class P1460 {
    public static void main(String[] args) {
        int[] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target, arr));
    }

    private static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        boolean ans = Arrays.equals(target, arr);

        return ans;
    }
}
