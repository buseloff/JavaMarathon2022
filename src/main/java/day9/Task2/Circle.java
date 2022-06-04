package day9.Task2;

public class Circle extends Figure {
    private double circleRadius;

    public Circle(String color, double circleRadius) {
        super(color);
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    @Override
    public double perimeter() {
        return (Math.PI * circleRadius) * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                '}';
    }
}
