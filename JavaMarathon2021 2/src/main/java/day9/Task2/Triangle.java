package day9.Task2;

public class Triangle extends Figure {
    private int lengthA;
    private int lengthB;
    private int lengthC;

    public Triangle(String color, int lengthA, int lengthB, int lengthC) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double semiperimeter = (double) (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - lengthA) *
                (semiperimeter - lengthB) * (semiperimeter - lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}
