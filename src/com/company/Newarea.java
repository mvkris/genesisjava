package com.company;

public class Newarea {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;
        int p = (a + b + c)/2;

        double area =  Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area " + area);
    }
}

