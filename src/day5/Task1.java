package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lambo = new Car();
        lambo.setYear(1990);
        lambo.setColor("Yellow");
        lambo.setModel("Countach");
        System.out.println(lambo.getYear() + " " + lambo.getColor() + " " + lambo.getModel());
    }
}
