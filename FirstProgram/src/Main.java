package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        System.out.println("Given character is small");
        else if(ch >= 'A' && ch <= 'Z')
            System.out.println("Given character is capital");
        else
            System.out.println("Invalid character");
    }
}
