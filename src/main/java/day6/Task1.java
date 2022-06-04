package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike(1990, "Blue", "CBR650R");
        honda.info();
        System.out.println(honda);
        Car audi = new Car();
        audi.setYearOfManufacture(2016);
        audi.setColor("Red");
        audi.setModel("A4");
        audi.info();
        System.out.println(audi);
        System.out.println(honda.yearDifference(2022));
        System.out.println(audi.yearDifference(2022));
    }
}

