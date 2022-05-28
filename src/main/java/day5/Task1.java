/*
1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */
package day5;

public class Task1 {
    public static void main(String[] args) {
        Car mercedesCar = new Car();
        mercedesCar.setYearOfManufacture(2017);
        System.out.println(mercedesCar.getYearOfManufacture());
        mercedesCar.setColor("Red");
        System.out.println(mercedesCar.getColor());
        mercedesCar.setModel("E200");
        System.out.println(mercedesCar.getModel());
        System.out.println(mercedesCar);
    }
}
