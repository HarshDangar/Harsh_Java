package Level_1;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(Ans(1230004032 , 0));
    }

    static int Ans(int num , int count){
        if(num == 0){
            return count;
        }

        int rem = num % 10;
        if(rem == 0){
            return Ans(num/10 , count+1);
        }


        return Ans(num/10, count);
    }
}
