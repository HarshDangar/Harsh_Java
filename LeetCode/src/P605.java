public class P605 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;

        if (n == 0)
            return true;

        for (int i = 0; i < l; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == l - 1) || (flowerbed[i + 1] == 0);

                //Plant condition
                if (left && right) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0)
                        return true;
                }
            }
        }
        return false;
    }
}
