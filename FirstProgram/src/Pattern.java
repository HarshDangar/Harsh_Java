package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = 'A';
        int row ;
        System.out.print("Enter row : ");
        row = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(a+j) + " ");
            }
            System.out.println();
        }
    }
}
