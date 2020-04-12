package hw2;

import java.util.Arrays;
import java.util.Random;

public class MyMas {
    public static void main(String[] args) {



        int size = 15;
        int [] masMas = new int[size];
        int [] masMas2 = new int [size*2];


        for ( int i=0; i<size; i++) {

            Random ran = new Random();

            masMas[i] = ran.nextInt();

        }

        for ( int j=0; j<size; j++) {

            masMas2 [j] = masMas[j];
            masMas2 [j + size] = masMas[j]*2;


        }

        System.out.println("Your array of random numbers is " + Arrays.toString(masMas2));

    }
}
