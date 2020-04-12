package hw2;

import java.util.Scanner;

public class Wallpapers {
    public static void main(String[] args) {
// ***+++***+++***+++***
        String stars = "***";
        String  pluses = "+++";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of lines");

        int lines = scanner.nextInt();

        for ( int j = 0; j<5; j++) {

            for (int i = 0; i < lines; i++) {

                if (i % 2 == 0) {
                    System.out.print(stars);
                } else {
                    System.out.print(pluses);
                }

            }

            System.out.println("");
        }
    }

}
