package day7;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double tank;

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setTank(double tank) {
        this.tank = tank;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        tank = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %f, вес: %f, объем топлива в баке: %f\n",
                producer, year, length, weight, tank);
    }
    public void fillUp(double liters) {
        this.tank += liters;
        System.out.printf("Бак заправлен на %f литров\n", liters);
    }

    public static void compare(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length) System.out.println("Первый самолёт длинее");
        else if (plane1.length == plane2.length) System.out.println("Длина самолётов равна");
        else System.out.println("Второй самолёт длинее");
    }
}
