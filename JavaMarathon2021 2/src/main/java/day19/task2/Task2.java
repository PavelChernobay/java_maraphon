package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату первой точки X1(число от 0 - 99):");
        int x1 = scanner.nextInt();

        System.out.println("Введите координату первой точки Y1(число от 0 - 99):");
        int y1 = scanner.nextInt();

        System.out.println("Введите координату второй точки X2(число от 0 - 99):");
        int x2 = scanner.nextInt();

        System.out.println("Введите координату второй точки Y2(число от 0 - 99):");
        int y2 = scanner.nextInt();

        int count = 0;
        Set<Integer> numbersCarsTaxi = new HashSet<>();

        for (Map.Entry<Integer, Point> entry : readFile().entrySet()) {
            Point taxiPoint = entry.getValue();
            if (isInside(taxiPoint, x1, x2, y1, y2)) {
                numbersCarsTaxi.add(entry.getKey());
                count++;
            }
        }

        System.out.println("Номера машин поблизости: " + numbersCarsTaxi);
        System.out.println("Количество машин поблизости: " + count);

    }

    public static Map<Integer, Point> readFile() {
        File file = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> carsTaxi = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(" ");
                carsTaxi.put(Integer.parseInt(line[0]),
                        new Point(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return carsTaxi;
    }

    public static boolean isInside(Point point, int x1, int x2, int y1, int y2) {
        return (point.getX() > x1 && point.getX() < x2 || point.getX() < x1 && point.getX() > x2) &&
                (point.getY() > y1 && point.getY() < y2 || point.getY() < y1 && point.getY() > y2);
    }
}

