package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantityOfFloors = input.nextInt();
        if (quantityOfFloors > 1 && quantityOfFloors <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (quantityOfFloors > 4 && quantityOfFloors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (quantityOfFloors >= 9) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка ввода");
    }
}
