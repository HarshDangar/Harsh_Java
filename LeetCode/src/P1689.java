public class P1689 {
    public static void main(String[] args) {
        String n = "82374";
        System.out.println(minPartitions(n));
    }

    private static int minPartitions(String n) {
        for (int i = 9; i > 0; i--) {
            if (n.contains(i + ""))
                return i;
        }
        return 0;
    }
}
