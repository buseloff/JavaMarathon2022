/*
1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет создать статический метод compareAirplanes, который в качестве аргументов
принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
какой из самолетов длиннее.
 */
package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 2004, 32,35000);
        Airplane a2 = new Airplane("Airbus", 2002, 38, 43000);
        Airplane.compareAirplanes(a1, a2);
    }

}