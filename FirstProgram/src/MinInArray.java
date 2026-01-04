package com.company;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 4, 90, 2};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] num){
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if(num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}
