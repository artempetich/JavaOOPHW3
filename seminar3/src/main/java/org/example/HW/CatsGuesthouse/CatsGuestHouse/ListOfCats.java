package org.example.HW.CatsGuesthouse.CatsGuestHouse;
import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cat>, Comparable<Cat> {
    private List<Cat> catList;
    private int count = 0;

    public ListOfCats(List<Cat> catList) {
        this.catList = catList;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatIterator(catList);
    }

    @Override
    public int compareTo(Cat cat) {
        if (catList.size() == 0 || cat.getName() == null) return 0;
        count++;
        return catList.get(count - 1).getName().compareTo(cat.getName());

    }
}
