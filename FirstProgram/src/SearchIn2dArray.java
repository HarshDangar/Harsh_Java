package com.company;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] num = {
                {12, 45, 78, 32, 99},
                {11 , -6, -88},
                {1, 4, 67},
                {11}
        };
        int target = 679;
        int[] ans = search(num , target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target)
                    return new int[]{row ,col}  ;
            }
        }
        return new int[]{-1, -1};
    } 
}
