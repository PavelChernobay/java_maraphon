package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people.txt");

        parseFileToStringList(file);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> lists = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lists.add(line);

                String[] array = line.split(" ");

                if (Integer.parseInt(array[1]) < 0) {
                    lists.clear();
                    throw new Exception();
                }
            }

            for (String list : lists) {
                System.out.println(list);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return lists;
    }
}
