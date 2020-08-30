package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void thisVehicle() {
        System.out.println("Это автомобиль");
    }
    public void yearDifference(int year) {
        System.out.println("Разница между переданным годом и годом выпуска транспортного средства " + (year - this.year) + " лет");
    }
}
