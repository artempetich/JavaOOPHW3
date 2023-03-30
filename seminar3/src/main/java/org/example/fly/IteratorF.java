package org.example.fly;
import java.util.Iterator;
import java.util.List;

public class IteratorF implements Iterator<Fly> {
    List<Fly> listFly;

    public IteratorF(List<Fly> listFly) {
        this.listFly = listFly;
        count = 0;
    }

    int count;

    @Override
    public boolean hasNext() {
        return count <= listFly.size() - 1;
    }

    @Override
    public Fly next() {
        count++;
        return listFly.get(count - 1);
    }
}
