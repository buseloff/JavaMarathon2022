package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike(1989, "Red", "CBR650R");
        honda.info();
        Car audi = new Car();
        audi.setYearOfManufacture(2017);
        audi.setColor("Blue");
        audi.setModel("A4");
        audi.info();
        System.out.println(honda.yearDifference(2020));
        System.out.println(audi.yearDifference(2020));
    }
}

