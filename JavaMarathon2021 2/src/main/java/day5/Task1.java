package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ford");
        car.setColor("grey");
        car.setYear(2013);

        System.out.println("Марка автомобиля: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год выпуска: " + car.getYear());
    }
}
