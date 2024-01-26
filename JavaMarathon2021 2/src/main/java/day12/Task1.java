package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Toyota", "Opel"));
        System.out.println(lists);

        int value = lists.size() / 2;
        lists.add(value, "Mercedes");

        lists.remove(0);

        System.out.println(lists);
    }
}
