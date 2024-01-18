package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        int eight = 0;
        int one = 0;
        int even = 0;
        int notEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11);
        }

        for (int ar : array) {
            sum += ar;
            if (ar > 8) {
                eight++;
            } else if (ar == 1) {
                one++;
            }
            if (ar % 2 == 0) {
                even++;
            } else {
                notEven++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
