public class P461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 3));
    }

    private static int hammingDistance(int x, int y) {
        int count = 0;

        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1))
                count++;

            x = x >> 1;
            y = y >> 1;
        }

        return count;
    }
}
