package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b || a == b) {
            System.out.println("Ошибка ввода");
        } else
            for (; a < b; a++) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
