package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Сергей", "Б-435");
        Teacher teacher1 = new Teacher("Игорь Петрович", "Математика");
        System.out.println(student1.getGroupName());
        student1.printInfo();
        System.out.println(teacher1.getSubjectName());
        teacher1.printInfo();

    }
}
