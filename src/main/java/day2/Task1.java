package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите этажность дома");
        int quantityOfFloors = input.nextInt();
        if (quantityOfFloors > 1 && quantityOfFloors <= 4) {
            System.out.println("Это малоэтажный дом");
        } else if (quantityOfFloors > 4 && quantityOfFloors <= 8) {
            System.out.println("Это среднеэтажный дом");
        } else if (quantityOfFloors >= 9) {
            System.out.println("Это многоэтажный дом");
        } else System.out.println("Ошибка ввода");
    }
}
