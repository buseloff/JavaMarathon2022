/*
2. Создать класс Мотоцикл (англ. Motorbike),
с  полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
Придерживаться принципов инкапсуляции и использовать ключевое слово this.
Геттером получить год выпуска, цвет, модель, вывести значения в консоль.

 */
package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike(2020, "Red", "CBR650R");
        System.out.println(honda.getYearOfManufacture());
        System.out.println(honda.getColor());
        System.out.println(honda.getModel());
    }
}
