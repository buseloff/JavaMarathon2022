package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Boeing", 2020, 100, 30000);
        airplane.fillUp(5600);
        System.out.println(airplane);
    }
}
