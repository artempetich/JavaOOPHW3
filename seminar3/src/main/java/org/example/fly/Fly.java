package org.example.fly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fly implements Iterable<Fly>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Fly{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Fly(String name, int age) {
        this.name = name;
        this.age = age;
    }
    List<Fly> ourFlies = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public Iterator<Fly> iterator() {
        return new IteratorF(ourFlies);
    }


}
