package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

    }

    public static List<People> parseFileToObjList(File file) {
        List<People> lists = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] array = line.split(" ");
                lists.add(new People(array[0], Integer.parseInt(array[1])));

                if (Integer.parseInt(array[1]) < 0) {
                    lists.clear();
                    throw new Exception();
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return lists;
    }
}
