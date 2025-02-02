package day6;

public class Airplane {
    private final String producer;
    private int year;
    private int length;
    private final int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Самолет{" +
                "Изготовитель = '" + producer + '\'' +
                ", год выпуска = " + year +
                ", длина = " + length +
                ", вес = " + weight +
                ", количество топлива в баке = " + fuel +
                '}';
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int addFuel) {
        fuel += addFuel;

    }
}
