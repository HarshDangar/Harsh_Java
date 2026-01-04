
public class palindrome {
    public static void main(String[] args) {
        int x = -121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }
    static boolean isPalindrome(int x){
        int reverse = 0;
        int n = x;

        while(n != 0){
            int remainder = n % 10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }

        if(reverse == x)
            return true;
        else
            return false;
    }
}
