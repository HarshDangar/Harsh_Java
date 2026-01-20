public class P1491 {
    public static void main(String[] args) {
        int[] nums = {4000, 3000, 1000, 2000};
        System.out.println(average(nums));
    }

    private static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;

        for (int num : salary) {
            total += num;
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        return (double) (total - min - max) / (salary.length - 2);
    }
}
