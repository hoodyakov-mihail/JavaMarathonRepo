package day8;

public class Task1 {
    public static void main(String[] args) {
        //Класс String
        long start = System.nanoTime();

        String s1 = "";
        for (int i = 0; i <= 20000 ; i++) {
            s1 += i + " ";
        }
        System.out.println(s1);
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Класс String, время работы: " + timeConsumedMillis);

        //StringBuilder
        long startSB = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000 ; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long finishSB = System.nanoTime();
        long timeConsumedMillisSB = finishSB - startSB;
        System.out.println("StringBuilder, время работы: " + timeConsumedMillisSB);

        //Airplane toString()
        Airplane plane1 = new Airplane("Boeing", 2000,150,10000);
        System.out.println(plane1);

    }
}
