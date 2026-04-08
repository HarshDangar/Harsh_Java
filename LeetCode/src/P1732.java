public class P1732 {
    public static void main(String[] args) {
        int[] arr = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(largestAltitude(arr));
    }

    private static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;

        for (int i = 1; i <= gain.length; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
