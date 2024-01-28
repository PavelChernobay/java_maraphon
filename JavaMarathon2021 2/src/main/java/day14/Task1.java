package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/text.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        List<Integer> numbers = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            int sum = 0;

            if (numbers.size() == 10) {
                for (Integer number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else {
                throw new Exception();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
