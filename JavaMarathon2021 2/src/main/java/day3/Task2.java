package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double first = scanner.nextDouble();
            double second = scanner.nextDouble();

            if (second == 0) {
                break;
            }

            double result = first / second;
            System.out.println(result);
        }
    }
}
