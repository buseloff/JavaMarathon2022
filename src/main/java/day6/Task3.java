package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Петр Николаевич", "Экономика");
        Student student1 = new Student("Николай Федоренко");
        teacher1.evaluate(student1);
        System.out.println(teacher1);
    }
}
