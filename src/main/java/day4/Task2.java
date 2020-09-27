/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        int maxNumber = array[0];
        int minNumber = array[0];
        int endsZero = 0;
        int sumEndsZero = 0;
        for (int elementOfArray : array) {
            if (elementOfArray > maxNumber) {
                maxNumber = elementOfArray;
            }
            if (elementOfArray < minNumber) {
                minNumber = elementOfArray;
            }
            if (elementOfArray % 10 == 0) {
                endsZero++;
                sumEndsZero += elementOfArray;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + maxNumber);
        System.out.println("Наименьший элемент массива: " + minNumber);
        System.out.println("Количество элементов массива оканчивающихся на 0: " + endsZero);
        System.out.println("Сумма элементов массива оканчивающихся на 0: " + sumEndsZero);

    }
}
