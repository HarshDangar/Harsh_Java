public class P278 {
    private static int firstBadVersion(int n) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;
    }

    private static boolean isBadVersion(int version) {
        return switch (version) {
            case 1 -> false;
            case 2 -> false;
            case 3 -> false;
            case 4 -> true;
            case 5 -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
