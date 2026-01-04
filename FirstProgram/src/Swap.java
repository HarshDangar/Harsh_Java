package com.company;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(Arrays.toString(swap(a,b)));
    }

    static int[] swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        return new int[]{x, y};
    }
}
