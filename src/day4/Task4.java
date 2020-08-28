package day4;

import java.util.Arrays;
import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */
public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }
        //System.out.println("\n"+ Arrays.toString(array));

        int[] maxSum3 = new int[array.length - 2];
        for (int i = 0; i < maxSum3.length; i++) {
            maxSum3[i] = array[i] + array[i + 1] + array[i + 2];
        }
        //System.out.println("\n"+ Arrays.toString(maxSum3));

        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < maxSum3.length ; i++) {
            if (maxSum3[i] > maxSum) {
                maxSum = maxSum3[i];
                maxIndex = i;
            }
        }
        System.out.println("Сумма: " + maxSum + "\nИндекс: " + maxIndex);
    }
}
