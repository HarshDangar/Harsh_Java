public class P278 {
    public static int firstBadVersion(int n) {
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

    static boolean isBadVersion(int version) {
        switch (version) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
