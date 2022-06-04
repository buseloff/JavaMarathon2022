package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student1) {
        Random random = new Random();
        int a = random.nextInt(4) + 2;
        System.out.println(a);
        String grade = null;
        switch (a) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Преподаватель " + name + " оценил студента с" +
                " именем " + student1.name + " по предмету " + subject + " на оценку " + grade);
    }

    @Override
    public String toString() {
        return "Преподаватель {" +
                "имя = '" + name + '\'' +
                ", предмет ='" + subject + '\'' +
                '}';
    }
}
