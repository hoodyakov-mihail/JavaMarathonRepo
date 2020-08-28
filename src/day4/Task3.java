package day4;

import java.util.Arrays;
import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
 */
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] array = new int[12][8];

        int[] sumArray = new int[12];
        for (int i = 0; i < array.length; i++) {
            //System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(51);
                sumArray[i] += array[i][j];
                //System.out.print(array[i][j] + " ");
            }
        }
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > maxSum) {
                maxSum = sumArray[i];
                maxIndex = i;
            }
        }
        //System.out.println("\n"+Arrays.toString(sumArray));
        System.out.println("Ответ: " + maxIndex + " (сумма " + maxSum + ")");
    }
}
