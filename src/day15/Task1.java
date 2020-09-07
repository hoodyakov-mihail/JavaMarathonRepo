package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("C:\\JavaMarathon2020\\src\\day15\\shoes.csv");
        File write = new File("C:\\JavaMarathon2020\\src\\day15\\writer.txt");
        Scanner scan = new Scanner(read);
        PrintWriter pw = new PrintWriter(write);

        int count = 0;
        int i = 0;
        while(scan.hasNextLine()) {
            String[] array = scan.nextLine().split(";");
            if (Integer.parseInt(array[2]) == 0) {
                pw.println(array[0]+", "+array[1]+", "+array[2]);
                //System.out.println(array[0]+", "+array[1]+", "+array[2]);
            }
            i++;
        }
        scan.close();
        pw.close();

    }
}
