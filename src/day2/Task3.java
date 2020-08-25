package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Введите число A: ");
        int a = scan.nextInt();
        //System.out.print("Введите число B: ");
        int b = scan.nextInt();
        a += 1;

        while (a < b) {
            if (a % 5 == 0 && !(b % 10 == 0)) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
