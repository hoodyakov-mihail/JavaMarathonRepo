package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike (int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Год выпуска: " + year + ", цвет: " + color + ", модель: " + model;
    }

    public void thisVehicle() {
        System.out.println("Это мотоцикл");
    }
    public void yearDifference(int year) {
        System.out.println("Разница между переданным годом и годом выпуска транспортного средства " + (year - this.year) + " лет");
    }
}
