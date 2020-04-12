package hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int input = scanner.nextInt();

        int [] masMas = new int[input];

        for ( int i=0; i<input; i++) {

            Random ran = new Random();

            masMas[i] = ran.nextInt();

        }

        System.out.println("Your array of random numbers is " + Arrays.toString(masMas));

    }
}
