package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10000);
        }

        int max = array[0];
        int min = array[0];
        int countZero = 0;
        int sum = 0;

        for (int ar : array) {
            if (ar < min) {
                min = ar;
            }

            if (ar > max) {
                max = ar;
            }

            if (ar % 10 == 0) {
                countZero++;
                sum += ar;
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(countZero);
        System.out.println(sum);
    }
}
