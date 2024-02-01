package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people.txt");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> lists = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] array = line.split(" ");

                if (Integer.parseInt(array[1]) < 0) {
                    throw new Exception();
                }

                lists.add(line);
            }

            return lists;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
