package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\JavaMarathon2020\\src\\day16\\file1.txt");
        File file2 = new File("C:\\JavaMarathon2020\\src\\day16\\file2.txt");
        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        //генерю 1000 рандомных чисел
        for (int i = 0; i < 1000 ; i++) {
            int random = (int)(Math.random() * 100 + 1);
            pw1.println(random);
        }
        pw1.close();
        //читаю группы по 20 чисел, высчитываю их среднее арифметичское(double), записываю в файл2
        int i = 0;
        int sum = 0;
        while (scan1.hasNextLine()) {
            sum += Integer.parseInt(scan1.nextLine());
            i++;
            if(i == 20) {
                pw2.println(sum / 20.0);
                i = 0;
                sum = 0;
            }
        }
        scan1.close();
        pw2.close(); // Не забывать закрывать потоки!

        double answer = 0;
        while (scan2.hasNextLine()) {
            answer += Double.parseDouble(scan2.nextLine());
        }
        scan2.close();
        System.out.println((int)answer);
    }
}
