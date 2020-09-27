/*
4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
значение суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [5789, 4, 8742]

Вывод в консоль:
14535
5

*Пояснение. Первое число - сумма тройки [5789, 4, 8742]. Второе число - индекс первого элемента тройки,
то есть индекс числа 5789.
 */
package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum;
        int maxSum = 0;
        int maxIndex = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i+1] + array[i+2];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = array[i];
            }
        }
        System.out.println(maxSum);
        System.out.println(maxIndex);
    }
}
