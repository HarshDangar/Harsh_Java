public class P3296 {
    public static void main(String[] args) {
        int mountainHeight = 10;
        int[] workerTimes = {3,2,2,4};
        System.out.println(minNumberOfSeconds(mountainHeight, workerTimes));
    }

    private static long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int maxTime = 0;
        for (int time: workerTimes) {
            maxTime = Math.max(maxTime, time);
        }

        long l = 1;
        long r = (long) maxTime * mountainHeight * (mountainHeight + 1) / 2;

        long result = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (check(mid, mountainHeight, workerTimes)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    private static boolean check(long mid, int mountainHeight, int[] workerTimes) {
        long height = 0;

        for (int time: workerTimes) {
            height += (long) (Math.sqrt(2.0 * mid / time + 0.25) - 0.5);

            if (height >= mountainHeight)
                return true;
        }
        return height >= mountainHeight;
    }
}
