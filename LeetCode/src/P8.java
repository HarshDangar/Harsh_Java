public class P8 {
    public static void main(String[] args) {
        String s = "-1337c0d3";
        System.out.println(myAtoi(s));
    }

    static int sign = 1;
    private static int myAtoi(String s) {
        if (s.isEmpty()) //String is empty
            return 0;

        int i = 0;

        //Step 1 : Skip leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        //If only whitespaces are in the string
        if (i >= s.length())
            return 0;

        //Step 2 : Determine sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return solve(s, i, 0);
    }

    private static int solve(String s, int currIdx, long ans) {
        if (currIdx >= s.length() || !Character.isDigit(s.charAt(currIdx)))
            //All char is checked or otherwise if character is not digit than stop
            return (int) (sign * ans);

        ans = ans * 10 + (s.charAt(currIdx) - '0');

        if (ans * sign <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        if (ans * sign >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return solve(s, currIdx + 1, ans);
    }
}
