public class P4030 {
    public static void main(String[] args) {
        String s = "leet";
        System.out.println(isPalindromic(s));
    }

    private static boolean isPalindromic(String s) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            int first = arr[start];
            int last = arr[end];

            for (int i = 0; i < 8; i++) {
                int bFirst = (first >> (8 - i - 1)) & 1;
                int bLast = (last >> i) & 1;

                if (bFirst != bLast)
                    return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
