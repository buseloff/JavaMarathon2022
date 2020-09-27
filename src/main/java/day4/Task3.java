/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам,
n - размерность по колонкам). В консоль вывести индекс строки,
сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7     // сумма - 18
1 2 5 6 2     // сумма - 16
3 4 9 6 4    // сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int sumOfLine;
        int lineWithMaxSum = 0;
        int maxSumOfLine = 0;
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            sumOfLine = 0;
            System.out.print("Индекс строки: " + i + " - ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                sumOfLine += array[i][j];
                System.out.print(array[i][j] + " ");
                if (sumOfLine > maxSumOfLine) {
                    maxSumOfLine = sumOfLine;
                    lineWithMaxSum = i;
                }
            }
            System.out.println("   Сумма строки: " + sumOfLine);
        }
        System.out.println("Ответ: " + lineWithMaxSum + " (индекс строки, сумма чисел в которой максимальна)");
//        System.out.println(Arrays.deepToString(array));
    }
}
