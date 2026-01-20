public class P925 {
    public static void main(String[] args) {
        String name = "alex", typed = "aaleexa";
        System.out.println(isLongPressedName(name, typed));
    }

    private static boolean isLongPressedName(String name, String typed) {
        int i = 1, j = 1;

        //Checking the first character
        if (name.charAt(0) != typed.charAt(0))
            return false;


        //Traversing the Strings using two pointer
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                if (typed.charAt(j) == typed.charAt(j - 1))
                    j++;

                else
                    return false;
            }
        }


        //Case 1 : i and j both reached end of the String
        if (i == name.length() && j == typed.length())
            return true;

            //Case 2 : First word is not yet complete traversed. The second word is complete
        else if (i != name.length() && j == typed.length())
            return false;

            //Case 3: First word complete. The second word still has some characters left.
        else {
            while (j != typed.length()) {
                if (typed.charAt(j) == typed.charAt(j - 1))
                    j++;
                else
                    return false;
            }
        }
        return true;
    }
}
