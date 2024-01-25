package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        addList(0, 30, lists);
        addList(300, 500, lists);

        System.out.println(lists);
    }

    public static void addList(int first, int second, List<Integer> lists) {
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                lists.add(i);
            }
        }
    }
}
