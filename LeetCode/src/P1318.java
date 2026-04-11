public class P1318 {
    public static void main(String[] args) {
        int a = 2, b = 6, c = 5;
        System.out.println(minFlips(a, b, c));
    }

    //Approach 1
    private static int minFlips(int a, int b, int c) {
        int ans = 0;

        while (a != 0 || b != 0 || c != 0) {
            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0){
                    ans++;
                }
            } else {
                if ((a & 1) == 1)
                    ans++;
                if ((b & 1) == 1)
                    ans++;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return ans;
    }

    //Approach 2
    private static int minFlips2(int a, int b, int c) {
        int result = (a | b) ^ c;

        //If both bit in a and b are 1 then vulnarability found because we have to add 2 flips in the answer
        int result1 = a & b;

        int result2 = result1 & result;

        return Integer.bitCount(result) + Integer.bitCount(result2);
    }
}
