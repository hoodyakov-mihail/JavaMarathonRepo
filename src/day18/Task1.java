package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(sumOfNumbers(0, numbers));
    }

    public static int sumOfNumbers(int i, int[] numbers){
        if (i == numbers.length - 1) {
            return numbers[i];
        }
        return numbers[i] + sumOfNumbers(i + 1,numbers);
    }
}
