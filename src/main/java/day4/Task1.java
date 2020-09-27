/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и
заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46

 */
package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        Random random = new Random();
        int biggerThanEight = 0;
        int equalsOne = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            if (array[i] > 8) {
                biggerThanEight++;
            }
            if (array[i] == 1) {
                equalsOne++;
            }
            if (array[i] % 2 == 0 && array[i] > 0) {
                numberOfEvenNumbers++;
            }
            if (array[i] % 2 != 0 && array[i] > 0) {
                numberOfOddNumbers++;
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количество числел больше 8: " + biggerThanEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + numberOfEvenNumbers);
        System.out.println("Количество нечетных чисел: " + numberOfOddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

