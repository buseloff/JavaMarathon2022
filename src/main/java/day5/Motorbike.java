package day5;

class Motorbike {
    private final int yearOfManufacture;
    private final String color;
    private final String model;

    public Motorbike(int yearOfManufacture, String color, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}