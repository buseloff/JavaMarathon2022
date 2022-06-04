package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 2014, 45,35000);
        Airplane a2 = new Airplane("Airbus", 2010, 23, 43000);
        Airplane.compareAirplanes(a1, a2);
    }

}