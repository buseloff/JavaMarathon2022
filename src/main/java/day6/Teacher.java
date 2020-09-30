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
        int a = random.nextInt(5);
        System.out.println(a);
        String grade = null;
        switch (a) {
            case 0:
                grade = "неудовлетворительно";
                break;
            case 1:
                grade = "неудовлетворительно";
                break;
            case 2:
                grade = "удовлетворительно";
                break;
            case 3:
                grade = "хорошо";
                break;
            case 4:
                grade = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с" +
                " именем "+ student1.name + " по предмету " + subject + " на оценку " + grade);
    }
}
