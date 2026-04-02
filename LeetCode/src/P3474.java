public class P3474 {
    public static void main(String[] args) {
        String str1 = "TFTF", str2 = "ab";
        System.out.println(generateString(str1, str2));
    }

    private static String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int N = n + m - 1;
        char[] word = new char[N];

        boolean[] canChange = new boolean[N];

        // Fill with placeholder
        for (int i = 0; i < N; i++) {
            word[i] = '$';
        }

        //Completing 'T' part
        for(int i = 0; i < n; i++) {
            if(str1.charAt(i) == 'T') {
                int idx = i; //Idx is used so direct change reflect in the i
                for(int j = 0; j < m; j++) {
                    //word[i] = str[j]

                    if(word[idx] != '$' && word[idx] != str2.charAt(j))
                        return "";

                    word[idx] = str2.charAt(j);
                    idx++;
                }
            }
        }

        //Fill the remaining spaces with the 'a'
        for(int i = 0; i < N; i++) {
            if(word[i] == '$') {
                word[i] = 'a';
                canChange[i] = true;
            }
        }

        //Process the 'F'
        for(int i = 0; i < n; i++) {
            if(str1.charAt(i) == 'F') {
                if(isSame(word, str2, i, m)) { //We have to change the one character so that it will not become same as str2
                    boolean changed = false;

                    for(int k = i + m - 1; k >= i; k--) { //Traversing from the right most character
                        if(canChange[k]) {
                            word[k] = 'b';
                            canChange[k] = false;
                            changed = true;
                            break;
                        }
                    }

                    //If no change is done so condition for the 'F' is break so return empty string
                    if(!changed) return "";
                }
            }
        }
        return new String(word);
    }

    private static boolean isSame(char[] word, String str2, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (word[i] != str2.charAt(j)) return false;
            i++;
        }
        return true;
    }
}
