package com.company;

public class EvenDigitsNum {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] arr) {
        int maincount = 0;
        for (int j : arr) {
            if (Even(j)) {
                maincount++;
            }
        }
        return maincount;
    }

    static boolean Even(int Number){
        int numberofDigits = digits(Number);

        return numberofDigits % 2 == 0;
        }

    static  int digits(int number2){
        int DigitCount = 0;

        if (number2 < 0){
            number2 = number2 * -1;
        }

        if (number2 == 0){
            return 1;
        }

        while(number2 > 0){
            DigitCount++;
            number2 = number2/10;
        }
        return DigitCount;
    }

}