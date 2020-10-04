package day9.Task2;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - firstSide) *
                (perimeter() / 2 - secondSide) * (perimeter() / 2 - thirdSide));
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
