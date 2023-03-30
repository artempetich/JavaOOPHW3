package org.example.HW.CatsGuesthouse.HedgehogsGuesthouse;
import java.util.Comparator;

public class HedgehogSortByAge implements Comparator<Hedgehog> {

    @Override
    public int compare(Hedgehog hedgehog1, Hedgehog hedgehog2) {
        return hedgehog1.getAge().compareTo(hedgehog2.getAge());
    }

}
