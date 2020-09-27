/*
1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */
package day5;

class Car {
    private int yearOfManufacture;
    private String color;
    private String model;

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setYearOfManufacture(2017);
        System.out.println(audi.getYearOfManufacture());
        audi.setColor("Blue");
        System.out.println(audi.getColor());
        audi.setModel("A4");
        System.out.println(audi.getModel());
    }
}
