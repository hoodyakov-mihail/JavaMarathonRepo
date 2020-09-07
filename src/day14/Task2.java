package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<String> people = null;
        try {
            people = parseFileToStringList();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        //Проверка на некорретность входного файла
        for (int i = 0; i < people.size(); i++) {
            String[] sNumbers = people.get(i).split(" ");
            //System.out.println(Arrays.toString(sNumbers));
            if(Integer.parseInt(sNumbers[1]) < 0) try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
        //Вывод в консоль
        System.out.println(people.toString());
    }

    public static List<String> parseFileToStringList() throws FileNotFoundException {
        List<String> people = new ArrayList<>();
        File file = new File("C:\\JavaMarathon2020\\src\\day14\\peoples");
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            people.add(i, scan.nextLine());
            i++;
        }
        scan.close();
        return people;
    }
}
