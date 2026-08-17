import java.util.Arrays;

public class P2706 {
    public static void main(String[] args) {
        int[] prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
        System.out.println(buyChoco2(prices, money));
    }

    private static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        if (prices[0] + prices[1] > money)
            return money;

        return money - prices[0] - prices[1];
    }

    private static int buyChoco2(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price <= min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        if (min1 + min2 > money)
            return money;

        return money - min1 - min2;
    }
}
