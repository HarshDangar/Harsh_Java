package com.company;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] num){
        int start = 0;
        int end = num.length-1;

        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }
}
