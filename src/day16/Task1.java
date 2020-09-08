package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\JavaMarathon2020\\src\\day16\\numbers");
        Scanner scan = new Scanner(file);

        String line = scan.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += Integer.parseInt(numbers[i]);
            i++;
        }
        double average = sum / (double)i;
        System.out.printf("Ответ: %.15f --> %.3f", average, average);
    }
}
