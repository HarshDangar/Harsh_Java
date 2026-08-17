public class P1422 {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
        System.out.println(maxScore2(s));
    }

    //Brute Force
    private static int maxScore(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int zerosLeft = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    zerosLeft++;
                }
            }

            int onesRight = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == '1') {
                    onesRight++;
                }
            }

            result = Math.max(result, zerosLeft + onesRight);
        }

        return result;
    }

    private static int maxScore2(String s) {
        int ans = Integer.MIN_VALUE;
        int ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1')
                ones++;
        }

        int left = 0;
        int right = ones;

        for(int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0')
                left++;
            else
                right--;

            ans = Math.max(ans, left + right);
        }
        return ans;
    }
}
