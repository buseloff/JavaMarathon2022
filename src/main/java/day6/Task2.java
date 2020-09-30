package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1999, 37, 38000 );
        airplane.info();
        airplane.setYear(2007);
        airplane.setLength(41);
        airplane.fillUp(10213);
        airplane.fillUp(4740);
        airplane.info();

    }
}
