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
        int sum = 0;
        if(sNumbers.length == 10){
            for (int i = 0; i < sNumbers.length ; i++) sum +=Integer.parseInt(sNumbers[i]);
        } else {
            try {
                throw new IOException();
            } catch ( IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
        scan.close();

        System.out.println(sum);
    }
}
