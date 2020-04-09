package com.company;

import java.util.Scanner;

public class MyNumber {
    public static void main(String[] args) {

        int v1 = getInteger();

        if (v1 % 2 == 0) {
            System.out.println("true");

            }

        else {
            System.out.println("false");

        }

    }

    public static int getInteger(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your  value");
        int v1 = scanner.nextInt();
        System.out.println("Your value is "+v1);
        return v1;

    }
}
