package org.example.HW.CatsGuesthouse.HedgehogsGuesthouse;
import java.util.Comparator;

public class HedgehogSortByName implements Comparator<Hedgehog> {
    @Override
    public int compare(Hedgehog hedgehog1, Hedgehog hedgehog2) {
        if (hedgehog1.getName() == null || hedgehog2.getName() == null) return 0;
        return hedgehog1.getName().compareTo(hedgehog2.getName());
    }
}
