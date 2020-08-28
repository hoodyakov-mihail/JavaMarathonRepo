package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = rand.nextInt(10001);
            //System.out.print(array[i] + " ");
        }

        int max = 0;
        for (int number:array) {
            if (number > max) max = number;
        }
        System.out.println("\nНаибольший элемент массива: " + max);

        int min = array[0];
        for (int number:array) {
            if (number < min) min = number;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int zeroEnd = 0;
        int zeroSum = 0;
        for (int number:array) {
            if (number % 10 == 0) {
                zeroEnd++;
                zeroSum +=number;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeroEnd);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + zeroSum);
    }
}
