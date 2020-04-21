package myfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class MyFile {

    public static void main(String[] args) {
        String filename = "students.txt";
        File file = new File(filename);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        System.out.println("Enter student name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        try {

            boolean lineExists = false;
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (int i = 0; i < lines.size(); i++) {

                if (lines.get(i).equals(input)) {
                    lineExists = true;
                }
            }

            if (!lineExists) {

                BufferedWriter myWriter = new BufferedWriter(
                        new FileWriter(filename, true)
                );
                myWriter.newLine();
                myWriter.write(input);
                myWriter.close();

                System.out.println("Student was added to a list");
            } else {
                System.out.println("Student already exists");
            }


        } catch (IOException e) {
            System.out.println("An error occurred!");
        }


    }

}
