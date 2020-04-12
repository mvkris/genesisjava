package hw2;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        int appPerLevel = 4;
        int levels = 9;
        int condos = 4;
        double appPerCondo = appPerLevel*levels;
//        double input = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your apartment number");

        int input = scanner.nextInt();


        int appExist = appPerLevel*levels*condos;

        if (input > appExist ) {
            System.out.println("Your apartment does not exist");
        } else {

            double result = Math.ceil(input / appPerCondo);

            System.out.println("Your Condo is " + result);

            double numberApp = (input % appPerCondo);
            double level = Math.ceil(numberApp / 4);
            if (level == 0) {
                level = levels;
            }

            System.out.println("Your level is " + level);
        }




    }
}
