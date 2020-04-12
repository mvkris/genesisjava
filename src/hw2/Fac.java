package hw2;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value");

        int input = scanner.nextInt();

        if (input<=4 || input >=16) {
            System.out.println("The value is not correct");
            return;
        }

        int result = 1;

        for (int i=1; i<= input; i++) {
            result = result*i;

        }

        System.out.println("Your result is " +result);

    }
}
