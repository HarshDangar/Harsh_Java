public class P1545 {
    public static void main(String[] args) {
        int n = 3, k = 1;
        System.out.println(findKthBit(n, k));
    }

    private static char findKthBit(int n, int k) {
        if (n == 1)
            return '0';

        int length = (int) Math.pow(2, n) - 1;
        int mid = (length / 2) + 1;

        if (k == mid) // Mid char is always 1
            return '1';

        if (k < mid) // meaning k is in first part which is S(i - 1)
            return findKthBit(n - 1, k);

        /* K > mid than k is in second part but second part is invert part of first half so if we find the char at relative
            position in first part than we can invert that character and that is out ans
         */
        return findKthBit(n - 1, length - k + 1) == '0' ? '1' : '0';
    }
}
