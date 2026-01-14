import java.util.Arrays;
import java.util.HashSet;

public class P762 {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        Integer[] primeArr = {2,3,5,7,11,13,17,19};
        HashSet<Integer> primeSet = new HashSet<>(Arrays.asList(primeArr));

        for (int i = left; i <= right; i++){
            int setBits = Integer.bitCount(i);
            if (primeSet.contains(setBits))
                count++;
        }

        return count;
    }

    public static int countPrimeSetBits2(int left, int right) {
        int count = 0;
        Integer[] primeArr = {2,3,5,7,11,13,17,19};
        HashSet<Integer> primeSet = new HashSet<>(Arrays.asList(primeArr));

        for (int i = left; i <= right; i++){
            if (primeSet.contains(countBit(i)))
                count++;
        }

        return count;
    }

    public static int countBit(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }
}
