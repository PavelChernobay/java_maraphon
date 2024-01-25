package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(
                new MusicBand("The Beatles", 1960),
                new MusicBand("Led Zeppelin", 1968),
                new MusicBand("Queen", 1970),
                new MusicBand("The Rolling", 1962),
                new MusicBand("Arctic Monkeys", 2002),
                new MusicBand("The Killers", 2001),
                new MusicBand("Mumford And Sons", 2007),
                new MusicBand("Twenty One Pilots", 2009),
                new MusicBand("Imagine Dragons", 2008)
        ));

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}