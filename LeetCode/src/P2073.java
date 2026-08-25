public class P2073 {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        String str = "harsh";
        System.out.println(timeRequiredToBuy(tickets, k));
        System.out.println(str.length());
        System.out.println(tickets.length);
    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;

        int i = 0;
        while (true) {
            int index = i % tickets.length;
            if (tickets[index] > 0) {
                tickets[index]--;
                seconds++;
            }

            if (tickets[k] == 0) {
                return seconds;
            }
            i++;
        }
    }
}
