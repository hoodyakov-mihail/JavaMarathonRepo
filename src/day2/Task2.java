package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Введите число A: ");
        int a = scan.nextInt();
        //System.out.print("Введите число B: ");
        int b = scan.nextInt();

        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && !(i % 10 == 0)){
                System.out.print(i + " ");
            }
        }
    }
}
