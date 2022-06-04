package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 16),
                new Triangle("Green", 10, 20, 33),
                new Triangle("Red", 10, 20, 11),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 6),
                new Circle("Red", 50),
                new Circle("Blue", 58)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;
    }
}


