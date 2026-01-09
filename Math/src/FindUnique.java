public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,2,8,4,7,6};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int unique = 0;
        for (int value: arr) {
            unique ^= value;
        }
        return unique;
    }
}
