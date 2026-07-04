public class P779 {
    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(kthGrammar(n, k));
        System.out.println(kthGrammar2(n, k));
    }

    private static int kthGrammar(int n, int k) {
        if (k == 1) {
            return 0;
        }

        int ans = kthGrammar(n, (k + 1) / 2);
        boolean firstChar = k % 2 != 0;

        if (firstChar) {
            if (ans == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (ans == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    //Recursion with Dividing the first half and second half
    private static int kthGrammar2(int n, int k) {
        if (n == 1 && k == 1)
            return 0;

        int length = (int) Math.pow(2, n - 1);
        int mid = length / 2;

        if (k <= mid) {
            return kthGrammar2(n - 1, k); //First half hoi to agal nu same result
        }

        return 1 - kthGrammar2(n - 1, k - mid); //Second half hoi to first half nu inverse
    }
}
