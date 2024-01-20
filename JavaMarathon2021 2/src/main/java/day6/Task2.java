package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Россия", 1980, 25, 35000);
        airplane.setYear(2010);
        airplane.setLength(30);
        airplane.fillUp(200);
        airplane.fillUp(120);
        airplane.info();
    }
}
