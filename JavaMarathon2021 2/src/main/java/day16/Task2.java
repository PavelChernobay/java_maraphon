package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("src/main/java/day16/file1.txt");
        File file2 = new File("src/main/java/day16/file2.txt");

        try {
            PrintWriter pwFile1 = new PrintWriter(file1);
            Random random = new Random();

            for (int i = 0; i < 1000; i++) {
                pwFile1.print(random.nextInt(100) + " ");
            }

            pwFile1.close();

            PrintWriter pwFile2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);

            List<Integer> numbers = new ArrayList<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            int sum = 0;

            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);

                if (i % 20 == 0) {
                    pwFile2.printf((double) sum / 20 + " ");
                    sum = 0;
                }
            }

            pwFile2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file = new File("src/test/resources/D16T2_1.txt");
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;

            while (scanner.hasNextLine()) {
                String[] numbers = scanner.nextLine().split(" ");

                for (String number : numbers) {
                    sum += Double.parseDouble(number);
                }
            }

            int sumInt = (int) sum;

            System.out.println(sumInt);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
