package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(file2);

            while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               String[] arrays = line.split(";");

               if (arrays.length != 3) {
                   throw new  Exception("Некорректный файл");
               }

               if (Integer.parseInt(arrays[2]) == 0) {
                   pw.println(arrays[0] + ", " + arrays[1] + ", " + arrays[2]);
               }
            }

            pw.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
