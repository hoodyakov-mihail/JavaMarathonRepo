package day5;

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
}
