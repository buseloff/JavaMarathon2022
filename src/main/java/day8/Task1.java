package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= 20000;i++) {
            numbers.append(i).append(" ");
        }
        System.out.println(numbers);
    }
}
