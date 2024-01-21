package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        String string = "";

        for (int i = 0; i < 20000; i++) {
            string += i + " ";
        }

        System.out.println(string);

        long stopTime1 = System.currentTimeMillis();

        System.out.println(stopTime1 - startTime1);

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);

        long stopTime2 = System.currentTimeMillis();

        System.out.println(stopTime2 - startTime2);
    }
}
