public class P1486 {
    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }

    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + (2 * i);
            ans ^= arr[i];
        }

        return ans;
    }
}
