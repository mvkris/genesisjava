package com.company;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {

        String v1 = getInteger("1-st");
        String v2 = getInteger("2-nd");

        int result = Integer.parseInt(v1) + Integer.parseInt(v2);
        String stringResult = Integer.toString(result);

        System.out.println("Your result is " + stringResult);
    }

    public static String getInteger(String order) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your " + order + " value");
        String v1 = scanner.nextLine();
        System.out.println("Your " + order + " value is " + v1);
        return v1;

    }
}

