public class P1758 {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));
    }

    private static int minOperations(String s) {
        char[] arr = s.toCharArray();
        return Math.min(helper(arr, true), helper(arr, false));
    }

    private static int helper(char[] arr, boolean isStartZero) {
        int count = 0;
        char flag = isStartZero ? '0' : '1';

        for (char c : arr) {
            if (c != flag) {
                count++;
            }
            flag = flag == '0' ? '1' : '0';
        }
        return count;
    }
}
