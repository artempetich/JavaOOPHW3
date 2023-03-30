package org.example.HW.CatsGuesthouse.CatsGuestHouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> ourCats = new ArrayList<>(Arrays.asList(
                new Cat("Kitty", 2),
                new Cat("Milly", 3),
                new Cat("Sushi", 10),
                new Cat("Wisker", 4),
                new Cat("Fluffy", 6)));

        Collections.sort(ourCats);

        ListOfCatIterator iter = new ListOfCatIterator(ourCats);

        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

    }
}
