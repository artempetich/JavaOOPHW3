package org.example.HW.CatsGuesthouse.HedgehogsGuesthouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Hedgehog> hedgehogsList = new ArrayList<>(Arrays.asList(
                new Hedgehog("Шустрик", 2),
                new Hedgehog("Туман", 4),
                new Hedgehog("Листик", 3),
                new Hedgehog("Грибочек", 21),
                new Hedgehog("Альфа", 12),
                new Hedgehog("Боровичок", 8),
                new Hedgehog("", 23)));

        Collections.sort(hedgehogsList, new HedgehogSortByName());

        for (Hedgehog heg : hedgehogsList) {
            System.out.println(heg.getName() + " " + heg.getAge());
        }

        System.out.println("--------------");

        Collections.sort(hedgehogsList, new HedgehogSortByAge());

        for (Hedgehog heg : hedgehogsList) {
            System.out.println(heg.getName() + " " + heg.getAge());
        }
    }
}
