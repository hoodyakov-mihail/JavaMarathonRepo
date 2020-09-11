package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(0,717771237));
    }

    public static int count7(int i, int number){
        int count = 0;
        String s = ""+number;
        String[] strings = s.split("");
        //System.out.print("i = "+i+" ");
        if (i == (strings.length)) {
            return count;
        }
        if (Integer.parseInt(strings[i]) == 7) {
            count++;
        }
        //System.out.println("count: "+count);
        return count + count7(i + 1, number);
    }

}
