package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        if (firstNumber > secondNumber || firstNumber == secondNumber) {
            System.out.println("Ошибка ввода");
        }
        while (firstNumber < secondNumber) {
            if (firstNumber % 5 == 0 && secondNumber % 10 != 0) {
                System.out.print(firstNumber + " ");
            }
            firstNumber++;
        }
    }
}
