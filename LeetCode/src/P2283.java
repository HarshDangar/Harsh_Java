public class P2283 {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    public static boolean digitCount(String num) {
        int[] freq = new int[10];
        for(char c : num.toCharArray()){
            freq[c-'0']++;
        }
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)-'0' != freq[i]) return false;
        }
        return true;
    }
}
