public class P1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth2(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < account.length; j++) {
                sum += account[j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    private static int maximumWealth2(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
