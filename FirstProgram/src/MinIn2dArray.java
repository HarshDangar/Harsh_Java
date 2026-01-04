package com.company;

import java.util.Arrays;

public class MinIn2dArray {
    public static void main(String[] args) {
        int[][] num = {
                {12, 45, 78, 32, 99},
                {11 , -6, 88},
                {1, 4, 67},
                {11}
        };

        int ans = Min(num);
        System.out.println(ans);
    }
    static int Min(int[][] arr){
        int min = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
