package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }

        int moreThan8 = 0;
        int equals1 = 0;
        int even = 0;
        int uneven = 0;
        int sum = 0;

        for (int number : array) {
            System.out.print(number + " ");
            if (number > 8) moreThan8++;
            if (number == 1) equals1++;
            if (number % 2 == 0) even++;
            if (number % 2 != 0) uneven++;
            sum += number;
        }

        System.out.printf("\nДлина массива: %d\n" +
                        "Количество чисел больше 8: %d\n" +
                        "Количество чисел равных 1: %d\n" +
                        "Количество четных чисел: %d\n" +
                        "Количество нечетных чисел: %d\n" +
                        "Сумма всех элементов массива: %d\n",
                arrayLength, moreThan8, equals1, even, uneven, sum);
    }
}
