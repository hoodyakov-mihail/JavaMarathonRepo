package day9.task2;

import day9.task2.Figure;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA)*(p - sideB)*(p - sideC));
    }
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
