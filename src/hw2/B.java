package hw2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;

        for ( int i=0; i<input.length(); i++) {

            if (input.charAt(i) == 'b') {

                count++;

            }

        }

        System.out.println("Number of b is " + count);



    }
}
