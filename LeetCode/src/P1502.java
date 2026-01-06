import java.util.Arrays;

public class P1502 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        System.out.println(canMakeArithmeticProgression(nums));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != difference)
                return false;
        }
        return true;
    }
}
