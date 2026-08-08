public class P165 {
    public static void main(String[] args) {
        String version1 = "1.2", version2 = "1.10";
        System.out.println(compareVersion(version1, version2));
    }

    private static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;

        while (i < version1.length() || j < version2.length()) {
            int v1Num = 0;
            int v2Num = 0;

            while (i < version1.length() && version1.charAt(i) != '.') {
                v1Num = v1Num * 10 + (version1.charAt(i) - '0');
                i++;
            }
            i++; //To skip .

            while (j < version2.length() && version2.charAt(j) != '.') {
                v2Num = v2Num * 10 + (version2.charAt(j) - '0');
                j++;
            }
            j++; //To skip .

            if (v1Num < v2Num)
                return -1;
            else if (v1Num > v2Num)
                return 1;
        }
        return 0;
    }
}
