public class P868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }

    private static int binaryGap(int n) {
        int curr = 0;
        int prev = -1;

        int result = 0;

        while (n > 0) {
            if ((n & 1) > 0) {
                result = (prev != -1) ? Math.max(result, curr - prev) : result;
                prev = curr;
            }

            curr++;
            n >>= 1;
        }
        return result;
    }

    //Approach 2
    private static int binaryGap2(int n) {
        //Because max we have to do 32 times because of the max number will have 32 bits
        int prev = -1;

        int result = 0;

        for (int curr = 0; curr < 32; curr++) {
            if (((n >> curr) & 1) > 0) {
                result = (prev != -1) ? Math.max(result, curr - prev) : result;
                prev = curr;
            }
        }

        return result;
    }
}
