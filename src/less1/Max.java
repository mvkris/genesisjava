package less1;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        int max;
        int v1 = getInteger("1-st");
        int v2 = getInteger("2-nd");
        int v3 = getInteger("3-rd");

        if (v1 > v2 ) {
            max = v1;
        }
        else {
            max = v2;
        }

        if (v3 > max ) {
            max = v3;
        }

        System.out.println("Maximum value is " + max) ;


    }

    public static int getInteger(String order){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your "+order+" value");
        int v1 = scanner.nextInt();
        System.out.println("Your "+order+" value is "+v1);
        return v1;

    }
}
