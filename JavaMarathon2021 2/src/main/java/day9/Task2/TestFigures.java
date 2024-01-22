package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumRedPerimeters = 0;

        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sumRedPerimeters += figures[i].perimeter();
            }
        }
        return sumRedPerimeters;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumRedArea = 0;

        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sumRedArea += figures[i].area();
            }
        }
        return sumRedArea;
    }
}
