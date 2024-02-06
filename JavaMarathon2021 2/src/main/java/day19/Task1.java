package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        Map<String, Integer> hashMap = new HashMap<>();


        while (scanner.hasNext()) {

            String word = scanner.next();

            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }

        scanner.close();

        System.out.println("Чичиков - " + hashMap.get("Чичиков"));

        hashMap.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(100).forEach(System.out::println);

    }
}
