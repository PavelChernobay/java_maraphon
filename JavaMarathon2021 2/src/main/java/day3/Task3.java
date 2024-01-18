package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            double first = scanner.nextDouble();
            double second = scanner.nextDouble();

            i++;

            if (second == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            double result = first / second;
            System.out.println(result);
        }
    }
}
