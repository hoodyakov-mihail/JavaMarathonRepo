package day9.task2;

import day9.task2.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}
