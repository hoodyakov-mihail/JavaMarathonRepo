package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\JavaMarathon2020\\src\\day14\\numbers");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        String line = scan.nextLine();
        String[] sNumbers = line.split(" ");
        if(sNumbers.length != 10){
            try {
                throw new IOException();
            } catch ( IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
        scan.close();

        int[] numbers = new int[sNumbers.length];
        int sum = 0;
        for (int i = 0; i < sNumbers.length ; i++) {
            numbers[i] = Integer.parseInt(sNumbers[i]);
            sum +=numbers[i];
        }
        //System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
