package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", "red", 1997);

        System.out.println("Марка мотоцикла: " + motorbike.getModel());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Год выпуска: " + motorbike.getYear());
    }
}