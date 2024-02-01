package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day16/text.txt");

        printResult(file);
    }

    public static void printResult(File file) {
        List<Integer> numbers = new ArrayList<>();
        double average;
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            for (Integer number : numbers) {
                sum += number;
            }

            average = (double) sum / numbers.size();

            System.out.printf(average + " --> %.3f", average);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

