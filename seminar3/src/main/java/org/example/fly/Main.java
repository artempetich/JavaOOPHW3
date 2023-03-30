package org.example.fly;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fly> flyList = new ArrayList<>(Arrays.asList(
                new Fly("Шустрик", 2),
                new Fly("Туман", 4),
                new Fly("Листик", 3),
                new Fly("Грибочек", 21),
                new Fly("Альфа", 12),
                new Fly("Боровичок", 8),
                new Fly("", 23)));

        IteratorF ourI = new IteratorF(flyList);

        while (ourI.hasNext())
            System.out.println(ourI.next().toString());

    }
}

