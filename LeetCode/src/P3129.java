import java.util.Arrays;

public class P3129 {
    public static void main(String[] args) {
        System.out.println((numberOfStableArrays(3,3,2)));
    }

    static int M = 1_000_000_007;
    static int[][][] t = new int[201][201][2];

    //Memoization
    private static int numberOfStableArrays(int zero, int one, int limit) {
        for (int[][] a : t) for (int[] b : a) Arrays.fill(b, -1);
        int startWithOne = solve(one, zero, 0, limit);
        int startWithZero = solve(one, zero, 1, limit);
        return (startWithOne + startWithZero) % M;
    }

    private static int solve(int onesLeft, int zerosLeft, int lastWasOne, int limit) {
        if (onesLeft == 0 && zerosLeft == 0)
            return 1;

        if (t[onesLeft][zerosLeft][lastWasOne] != -1) {
            return t[onesLeft][zerosLeft][lastWasOne];
        }

        int result = 0;
        
        if (lastWasOne == 1) { //explore zero
            for (int len = 1; len <= Math.min(zerosLeft, limit); len++) {
                result = (result + solve(onesLeft, zerosLeft - len, 0, limit)) % M;
            }
        } else {
            for (int len = 1; len <= Math.min(onesLeft, limit); len++) {
                result = (result + solve(onesLeft - len, zerosLeft, 1, limit)) % M;
            }
        }

        return t[onesLeft][zerosLeft][lastWasOne] = result;
    }

    //Bottom up
    private static int numberOfStableArrays2(int zero, int one, int limit) {
        int M = 1_000_000_007;
        int[][][] t = new int[one + 1][zero + 1][2];

        // Base case
        t[0][0][0] = 1;
        t[0][0][1] = 1;

        for (int onesLeft = 0; onesLeft <= one; onesLeft++) {
            for (int zerosLeft = 0; zerosLeft <= zero; zerosLeft++) {
                if (onesLeft == 0 && zerosLeft == 0)
                    continue;

                // if(lastWasOne == true) { explore 0s }
                int result = 0;
                for (int len = 1; len <= Math.min(zerosLeft, limit); len++) {
                    result = (result + t[onesLeft][zerosLeft - len][0]) % M;
                }
                t[onesLeft][zerosLeft][1] = result;

                // else { explore 1s }
                result = 0;
                for (int len = 1; len <= Math.min(onesLeft, limit); len++) {
                    result = (result + t[onesLeft - len][zerosLeft][1]) % M;
                }
                t[onesLeft][zerosLeft][0] = result;
            }
        }
        int startWithOne  = t[one][zero][0]; // solve(one, zero, false, limit)
        int startWithZero = t[one][zero][1]; // solve(one, zero, true, limit)
        return (startWithOne + startWithZero) % M;
    }
}
