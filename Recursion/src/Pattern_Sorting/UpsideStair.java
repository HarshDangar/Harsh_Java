package Pattern_Sorting;

public class UpsideStair {
    /*
    * * * *
    * * *
    * *
    *

     */

    public static void main(String[] args) {
        star2(4,0);
    }

    static void star(int row , int col) {
        if (row == 0){
            return;
        }

        if (col < row) {
            System.out.print("*");
            star(row , col+1);
        } else {
            System.out.println();
            star(row-1 , 0);
        }

    }

    static void star2(int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            star2(row , col+1);
            System.out.print("*");
        } else {
            star2(row-1 , 0);
            System.out.println();
        }
    }
}
