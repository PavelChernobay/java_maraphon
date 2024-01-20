package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String item;

    public Teacher(String name, String item) {
        this.name = name;
        this.item = item;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int value = random.nextInt(2, 6);

        String grade = switch (value) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> null;
        };

        System.out.println("Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + item + " на оценку " + grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
