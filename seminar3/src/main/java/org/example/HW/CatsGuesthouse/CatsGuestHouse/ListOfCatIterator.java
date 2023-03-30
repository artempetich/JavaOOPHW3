package org.example.HW.CatsGuesthouse.CatsGuestHouse;
import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catList;
    private int counter;

    public ListOfCatIterator(List<Cat> catList) {
        this.catList = catList;
        counter = 0;

    }

    @Override
    public boolean hasNext() {
        return counter < catList.size();
    }

    @Override
    public Cat next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("End of list.");
        }
        counter++;
        return catList.get(counter - 1);
    }
}
